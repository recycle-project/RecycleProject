package com.sinc.ssgbin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private WebView mWebview;
    private static final String TAG = "FCM 테스트용 태그";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("태그", "시작");

        // 디바이스 토큰 확인
        //Toast toast = Toast.makeText(getApplicationContext(), FirebaseInstanceId.getInstance().getToken().toString(), Toast.LENGTH_LONG);
        //toast.show();

        webviewSet();
    }

    private void webviewSet() {
        // ec2: 15.164.99.19
        // local: 10.149.178.108
        // taeseon: 10.149.178.13
        // soojin: 10.149.179.121
        // AndroidBridge 파일 안에서도 바꿔줘야 해!
        mWebview = (WebView) findViewById(R.id.webview);
        // 푸시 정보가 있는지 확인
        UserVO userVO = (UserVO) getIntent().getSerializableExtra("user");
        if(userVO != null){
            Log.d(TAG, "webviewSet: user exist");
            String queryString = "employee_name="+userVO.getEmployee_name()+"&pwd="+userVO.getPwd()+"&store_id="+userVO.getStore_id();
            mWebview.loadUrl("http://15.164.99.19:8088/ssgBin/user/login?"+queryString);
        } else {
            Log.d(TAG, "webviewSet: user does not exist");
            mWebview.loadUrl("http://15.164.99.19:8088/ssgBin");
        }

        // JavaScript 브릿지 세팅
        AndroidBridge ab = new AndroidBridge(mWebview, MainActivity.this);
        mWebview.addJavascriptInterface(ab, "Android");

        //////////// brower load
        mWebview.setWebViewClient(new WebViewClientClass());
        ////////////script
        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.getSettings().setSupportZoom(true);
        mWebview.getSettings().setBuiltInZoomControls(true);
        mWebview.getSettings().setDisplayZoomControls(false);
        //////
        mWebview.getSettings().setLoadWithOverviewMode(true);
        mWebview.getSettings().setUseWideViewPort(true);

        mWebview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mWebview.invalidate();
            }
        });
    }

    public class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
