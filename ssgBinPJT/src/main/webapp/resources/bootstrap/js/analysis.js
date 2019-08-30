var recptData = [];


function makeGraph(recptData) {
	var glp_ctx = document.getElementById('garbage-store-bar-1').getContext('2d');
	var glp_data = {
	     datasets: [{
	         data: recptData,
	         backgroundColor: [
	        	 '#edf8fb', '#b2e2e2', '#66c2a4', '#238b45',
	             'rgba(153, 102, 255, 0.2)',
	             'rgba(255, 159, 64, 0.2)'
	         ],
	         borderColor: [
	        	 '#edf8fb', '#b2e2e2', '#66c2a4', '#238b45',
	             'rgba(153, 102, 255, 1)',
	             'rgba(255, 159, 64, 1)'
	         ],
	         borderWidth: 1
	     }],
	     // These labels appear in the legend and in the tooltips when
	     // hovering different arcs
	     labels: [
	         'Can',
	         'Bottle',
	         'Plastic',
	         'Trash'
	     ]
	};
	
	var glp_options = {
		maintainAspectRatio: false,
		title : {
			display:true,
			fontSize: 19,
			text:'주간 누적 쓰레기량',
			position: 'top'
		},
		layout:{
			padding:{
				left:70,
				right:50,
				bottom: 10
			}
		},
		legend: {	
			display: true,
		    labels: {
	           fontColor: '#666666',
	           fontFamily: 'sans-serif',
	           fontSize: 12,
	           fontStyle: 'bold',
	           boxWidth: 20,
	           padding : 13
	        },
	        position: 'right',
		 },
		 tooltips: {
		    callbacks: {
		      label: function(tooltipItem, data) {
		        // get the concerned dataset
		        var dataset = data.datasets[tooltipItem.datasetIndex];
		        // calculate the total of this data set
		        var total = dataset.data.reduce(function(previousValue, currentValue, currentIndex, array) {
		          return previousValue + currentValue;
		        });
		        // get the current items value
		        var currentValue = dataset.data[tooltipItem.index];
		        // calculate the precentage based on the total and current item,
				// also this does a rough rounding to give a whole number
		        var percentage = Math.floor(((currentValue/total) * 100)+0.5);
	
		        return data.labels[tooltipItem.index] + ": " + currentValue + " of " + total + "(" + percentage + "%)";
		      }
		    }
		 },
		 plugins: {
			 datalabels: {
		            formatter: (value, ctx) => {
		                let sum = 0;
		                let dataArr = ctx.chart.data.datasets[0].data;
		                dataArr.map(data => {
		                    sum += data;
		                });
		                let percentage = (value*100 / sum).toFixed(1)+"%";
		                return percentage;
		            },
		            color : '#000',
		            anchor : 'center',
		            position : 'outside',
		            align : 'center',
	// offset: 1,
		            font : {
		            	size :10,
		            	style : 'bold'
		            		// family, style, weight 가능
		            }
		     }
		}
	};
	var glp_chart = new Chart(glp_ctx, {
	    type: 'pie',
	    data: glp_data,
	    options: glp_options	
	});
};
$(document).ready(function(){
	$.ajax({
		url : "/ssgBin/dashboard/data",
		data : {storeId : storeId},
		method : "GET",
		dataType : "json"
	})
	.done(function(result) {
		recptData = result;
		makeGraph(recptData);
	});
});
