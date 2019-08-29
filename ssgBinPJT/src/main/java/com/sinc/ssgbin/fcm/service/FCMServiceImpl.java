package com.sinc.ssgbin.fcm.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sinc.ssgbin.user.model.vo.UserVO;

@Service("fcmService")
public class FCMServiceImpl implements FCMService{
	
	// fcm을 통해서 안드로이드에 푸시 메시지를 전달
	// params: users는 푸시를 받을 사람들이고, push는 STORE_NAME, CATEGORY를 key로 하여 푸시 메시지 내용을 생성하는데 사용됨.
	// rlt: 1=success, -1=fail
	@Override
	public int sendNotification(List<UserVO> users, HashMap<String, String> push) {
		System.out.println("FCMServiceImpl sendNotification()");
		
		// firebase cloud messaging server key
		final String apiKey ="AAAA6-VWMPo:APA91bHDJ6Yy4uC977J4vXbKp3_pCR22DBJNmJzX1lQmWM-iacuJyhfYeMxwzEvfAi86nlavonwQZUax9HIEstsbQiQfi5jFq7iItSiKpQ_8v5XigWVmsGJ_O6EDHD-MoRa6osApqXJD";
		
		try {
			URL url = new URL("https://fcm.googleapis.com/fcm/send");
			
			for(int i=0; i<users.size(); i++) {
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				conn.setRequestProperty("Authorization", "key=" + apiKey);
				conn.setDoOutput(true);
				
				// specific device token
				String token = users.get(i).getToken();
				// 매장 이름은 Store
				String title = push.get("STORE_NAME")+" 매장 알림";
				// 기기 이름은 Equipment
				String content = push.get("CATEGORY") + " 기기에서 이상현상이 감지되었습니다. 확인 부탁드립니다.";
				// notification id random 생성
				double randomValue = Math.random();
				int noti_id = (int)(randomValue*1000);
				String input = "{\"data\" : {\"title\" : \"" + title + "\", \"content\" : \"" + content + "\", \"noti_id\" : \"" + noti_id + "\"}, \"to\":\"" + token + "\"}";

				OutputStream os = conn.getOutputStream();
		        
				os.write(input.getBytes("UTF-8"));
				os.flush();
				os.close();
				
				int responseCode = conn.getResponseCode();
				System.out.println("\nSending 'POST' request to URL : " + url);
				System.out.println("Post parameters : " + input);
				System.out.println("Response Code : " + responseCode);
				        
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
				     response.append(inputLine);
				}
				in.close();
				conn.disconnect();
			}
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		} 
	}
}
