package com.sinc.ssgbin;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

import com.sinc.ssgbin.MainActivity;

import static android.content.ContentValues.TAG;

public class HttpUtil extends AsyncTask<String, String, String>{
    private Context context;

    public HttpUtil(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        // 호출 전
        System.out.println("************************************************* 서버 호출 선행" );
    }


    @Override
    public String doInBackground(String...params) {
        //System.out.println("************************************************* 서버 호출" );
        Log.d(TAG, "doInBackground: server call process starat");
        String paramString = "";
        String url = params[0];
        String employee_name = params[1];
        String pwd = params[2];
        String token = params[3];
        //System.out.println("************************************************* 서버 호출 url : " + url);
        Log.d(TAG, "doInBackground: server url called: " + url);

        paramString = "employee_name="+employee_name+"&"+"pwd="+pwd+"&"+"token=" + token;

        try {
            URL obj = new URL(url + "?" + paramString);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");

            byte[] outputInBytes = params[0].getBytes("UTF-8");
            OutputStream os = conn.getOutputStream();
            os.write( outputInBytes );
            os.close();

            int retCode = conn.getResponseCode();

            Log.d(TAG, "doInBackground: server call result code: " + retCode);
            //System.out.println("************************************************* 서버 호출 결과 코드 : " + retCode );
            if (retCode == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                char[] buff = new char[512];
                int len = -1;
                String line;
                StringBuffer response = new StringBuffer();
                while((len = br.read(buff)) != -1) {
                    response.append(new String(buff, 0, len));
                }
                br.close();
                Log.d(TAG, "doInBackground: server call result. text: " + response.toString());
                //System.out.println("************************************************* 서버 호출 결과 text : " + response.toString());

                return response.toString();
            }else{
                Log.d(TAG, "doInBackground: fail to call server. code: " + retCode);
                //System.out.println("************************************************* 서버 호출 실패 code : " + retCode );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 호출이 끝난 후
    @Override
    protected void onPostExecute(String result) {
        /*
        JSONObject object = null;
        try {
            object = new JSONObject(result);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        */
        Log.d(TAG, "onPostExecute: after server");
        //String rtn = "";
        /*
        try {
            // return 받은 Json 데이터
            //rtn = URLDecoder.decode(object.getString("DATA"), "UTF-8");
            //((MainActivity) context).printToast(rtn);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        */

    }
}
