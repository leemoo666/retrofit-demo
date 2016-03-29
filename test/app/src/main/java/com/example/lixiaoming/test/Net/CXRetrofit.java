package com.example.lixiaoming.test.Net;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


/**
 * Created by lixiaoming on 16/3/29.
 */
public class CXRetrofit {

    private static String BASE_URL = "http://www.iguamu.com/guamu/api/v1/";


    private static Retrofit mRetrofit;

    private static OkHttpClient mClient;

    private static CXRetrofit mInstance;


    public static CXRetrofit getInstance() {
        synchronized (CXRetrofit.class) {
            if (null == mInstance) {
                mInstance = new CXRetrofit();
                init();
            }
        }
        return mInstance;
    }

    private static void init() {
        mClient = new OkHttpClient();
        mClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                return response;
            }
        });

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(mClient)
                .build();

    }

    public IService getServices() {
        IService service = mRetrofit.create(IService.class);
        return service;

    }

}
