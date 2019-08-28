/**
 * 
 */

var glp_ctx = document.getElementById('garbage-store-bar-1').getContext('2d');
var glp_data = {
     datasets: [{
         data: [10, 20, 30, 10],
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

     // These labels appear in the legend and in the tooltips when hovering different arcs
     labels: [
         'Can',
         'Bottle',
         'Plastic',
         'Trash'
     ]
 };

var glp_options = {

title	:{
	display:true,
	fontSize: 23,
	text:'주간 누적 쓰레기량',
	position: 'top'
},
layout:{
	padding:{
		left:70,
		right:50,
		bottom: 20
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
           padding : 20
        },
  position: 'right',
 },
 tooltips: {
    callbacks: {
      label: function(tooltipItem, data) {
        //get the concerned dataset
        var dataset = data.datasets[tooltipItem.datasetIndex];
        //calculate the total of this data set
        var total = dataset.data.reduce(function(previousValue, currentValue, currentIndex, array) {
          return previousValue + currentValue;
        });
        //get the current items value
        var currentValue = dataset.data[tooltipItem.index];
        //calculate the precentage based on the total and current item, also this does a rough rounding to give a whole number
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
                let percentage = (value*100 / sum).toFixed(2)+"%";
                return percentage;
            },
            color: '#000',
            anchor: 'center',
            font: {
             size: 10,
             style: 'bold'
             //family, style, weight 가능
            }
        }
    }
};
var glp_chart = new Chart(glp_ctx, {
    type: 'pie',
    data: glp_data,
    options: glp_options	
});

/*
 * 매장별 차트 #1
 */
/*
var gsb_ctx_1 = document.getElementById('garbage-store-bar-1').getContext('2d');
var gsb_data_1 = {
     labels: ["Can", "Bottle", "Plastic", "Trash"],
     datasets: [{
       label: '# of Tomatoes',
       data: [12, 19, 3, 5],
       backgroundColor: [
         'rgba(255, 99, 132, 0.2)',
         'rgba(54, 162, 235, 0.2)',
         'rgba(255, 206, 86, 0.2)',
         'rgba(75, 192, 192, 0.2)',
         'rgba(153, 102, 255, 0.2)',
         'rgba(255, 159, 64, 0.2)',
       ],
       borderColor: [
         'rgba(255,99,132,1)',
         'rgba(54, 162, 235, 1)',
         'rgba(255, 206, 86, 1)',
         'rgba(75, 192, 192, 1)',
         'rgba(153, 102, 255, 1)',
         'rgba(255, 159, 64, 1)',
       ],
       borderWidth: 1
     }]
};
var gsb_options_1 = {
  legend: {
   display: false
  },
     scales: {
         xAxes: [{
           ticks: {
             //maxRotation: 90,
             //minRotation: 80
           }
         }],
         yAxes: [{
           ticks: {
             beginAtZero: true
           },
           scaleLabel: {
                  display: true,
                  labelString: "Count of Refresh"
              }
         }]
       },
       tooltips: {
        callbacks: {
       title: function() {},
         label: function(tooltipItem, data) {
           //get the concerned dataset
           var dataset = data.datasets[tooltipItem.datasetIndex];
           //calculate the total of this data set
           var total = dataset.data.reduce(function(previousValue, currentValue, currentIndex, array) {
             return previousValue + currentValue;
           });
           //get the current items value
           var currentValue = dataset.data[tooltipItem.index];
           //calculate the precentage based on the total and current item, also this does a rough rounding to give a whole number
           var percentage = Math.floor(((currentValue/total) * 100)+0.5);

           return data.labels[tooltipItem.index] + ": " + currentValue + " of " + total + "(" + percentage + "%)";
         }
       }
      },
      animation: {
            onComplete: function() {
              //rendering 후
            }
         }
     };
var gsb_chart_1 = new Chart(gsb_ctx_1, {
    type: 'bar',
    data: gsb_data_1,
    options: gsb_options_1
});

*/