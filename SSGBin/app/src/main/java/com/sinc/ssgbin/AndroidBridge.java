package com.sinc.ssgbin;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.firebase.iid.FirebaseInstanceId;

public class AndroidBridge {
    private String TAG = "AndroidBridge";
    final public Handler handler = new Handler();

    private WebView wv;
    private MainActivity mContext;

    public AndroidBridge(WebView _wv, MainActivity _mContext){
        wv = _wv;
        mContext = _mContext;
    }

    @JavascriptInterface
    public void getUser(String employee_name, String pwd){
        Log.d(TAG, "getUser: start process");
        Log.d(TAG, "getUser: employe_name="+employee_name+", pwd: "+pwd);

        // 여기서 http 유틸로 날려야지!
        // DB 갱신을 위해 User(name, pwd, token) 정보를 Spring 서버로 전송
        sendDeviceToken(employee_name, pwd, FirebaseInstanceId.getInstance().getToken().toString());

        handler.post(new Runnable(){
            @Override
            public void run(){
                Log.d(TAG, "run: start process");
            };
        });
    }

    private void sendDeviceToken(String employee_name, String pwd, String token){
        Log.d(TAG, "sendDeviceToken: process start");
        String url = "http://15.164.99.19:8088/ssgBin/fcm/token";
        HttpUtil hu = new HttpUtil(mContext);
        String[] params = {url, employee_name, pwd, token};
        hu.execute(params);
    }
}
