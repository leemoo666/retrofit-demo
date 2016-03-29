package com.example.lixiaoming.test.Net;

import com.example.lixiaoming.test.module.Response;
import com.example.lixiaoming.test.module.ResponseList;
import com.example.lixiaoming.test.module.User;

import retrofit.Callback;

/**
 * Created by lixiaoming on 16/3/29.
 */
public class LoginService {

    private IService service;
    public LoginService() {

        service = CXRetrofit.getInstance().getServices();
    }

    /**
     * 登录模块
     * */
    public void login(User user, Callback<Response> callback) {
        service.loadUsers(user).enqueue(callback);
    }

    public void getList(String city,String v,Callback<ResponseList> callback){
        service.getList("1002","1").enqueue(callback);
    }

}
