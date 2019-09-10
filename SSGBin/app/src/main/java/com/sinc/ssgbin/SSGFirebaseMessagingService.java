package com.sinc.ssgbin;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import com.sinc.ssgbin.R;

import java.util.HashMap;

public class SSGFirebaseMessagingService extends FirebaseMessagingService {
    /**
     * 구글 토큰을 얻는 값입니다.
     * 아래 토큰은 앱이 설치된 디바이스에 대한 고유값으로 푸시를 보낼때 사용됩니다.
     * **/
    private static final String TAG = "FCM 테스트용 태그";

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("태그", "푸시푸시");
        Log.e("Firebase", "FirebaseInstanceIDService : " + s);
    }

    /**
     * 메세지를 받았을 경우 그 메세지에 대하여 구현하는 부분입니다.
     * **/

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {  //data payload로 보내면 실행
        // ...
        //Log.d(TAG, FirebaseInstanceId.getInstance().getToken()); //토큰 받아오는 코드
        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        //여기서 메세지의 두가지 타입(1. data payload 2. notification payload)에 따라 다른 처리를 한다.
        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
                scheduleJob();
            } else {
                // Handle message within 10 seconds
                handleNow();
            }

        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        //화면을 깨운다.(이방법은 Deprecated 되었다고 한다. 당장 작동은 되지만 나중에 어떻게 될지 모른다?)
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wakeLock = powerManager.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP, "AppName:tag");
        wakeLock.acquire(3000);

        //String title = remoteMessage.getNotification().getTitle();
        //String body = remoteMessage.getNotification().getBody();
        sendNotification(remoteMessage);
    }

    private void scheduleJob() {
        //이건 아직 나중에 알아 볼것.
        Log.d(TAG, "이것에 대해서는 나중에 알아 보자.");
    }

    private void handleNow() {
        Log.d(TAG, "10초이내 처리됨");
    }

    private void sendNotification(RemoteMessage remoteMessage) {
        String title = remoteMessage.getData().get("title");
        String messageBody = remoteMessage.getData().get("content");
        int noti_id = Integer.parseInt(remoteMessage.getData().get("noti_id"));
        int store_id = Integer.parseInt(remoteMessage.getData().get("store_id"));
        String employee_name = remoteMessage.getData().get("employee_name");
        String pwd = remoteMessage.getData().get("pwd");
        UserVO userVO = new UserVO(employee_name, pwd, store_id);

        if(userVO != null){
            Log.d(TAG, "sendNotification: user from push. name="+employee_name);
        }

        if (title == null){
            //제목이 없는 payload이면
            title = "푸시 알림 테스트"; //기본제목을 적어 주자.
        }
        //Log.d(TAG, "ㅎㅇ");

        //전달된 액티비티에 따라 분기하여 해당 액티비티를 오픈하도록 한다.
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("user", userVO);
        /*
        if (click_action.equals("ResultActivity")) {
            //Log.d(TAG, "ㅂㅇ");
            intent = new Intent(this, ResultActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        } else {
            intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }
        */

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_ONE_SHOT);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        ///////////////// 오레오 이상 버젼 때문에 추가
        String channelId = "channel";
        String channelName = "Channel Name";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            int importance = NotificationManager.IMPORTANCE_HIGH;

            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);

            notificationManager.createNotificationChannel(mChannel);

        } ///////////////
        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.drawable.ssgbin_logo)
                .setContentTitle(title)
                .setContentText(messageBody)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setVibrate(new long[]{1000, 1000})
                .setLights(Color.BLUE, 1,1)
                .setContentIntent(pendingIntent)
                .setPriority(Notification.PRIORITY_MAX); // required
        notificationManager.notify(noti_id /* ID of notification */, notificationBuilder.build());
    }

}
