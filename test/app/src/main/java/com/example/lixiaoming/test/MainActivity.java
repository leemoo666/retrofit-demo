package com.example.lixiaoming.test;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.lixiaoming.test.Net.CXRetrofit;
import com.example.lixiaoming.test.Net.LoginService;
import com.example.lixiaoming.test.module.ResponseList;
import com.example.lixiaoming.test.module.User;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setCellphone("15901038463");
                user.setChannel("baidu");
                user.setDeviceId("Ah870qg0_7XysbxDHXhZtLGmI77viwgjrmw6Zy5HN3bq");
                user.setDeviceType("0");
                user.setPass("7c4a8d09ca3762af61e59520943dc26494f8941b");
                user.setResolutionHeight("540");
                user.setResolutionWidth("540");

                LoginService service = new LoginService();
                service.getList("", "", new Callback<ResponseList>() {
                    @Override
                    public void onResponse(Response<ResponseList> response, Retrofit retrofit) {
                        Log.i("lxm","response");///
                        ///
                        Log.i("lxm","response");
                        Log.i("","");
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        Log.i("lxm","failure");
                    }
                });

            }
        });
        /****/
////////////////////
        ////////////////
        //****/
    }
}
