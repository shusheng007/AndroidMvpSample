package com.ss007.androidmvpsample.mvp;

import android.os.Handler;

/**
 * Copyright (C) 2017
 *
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:30
 * @description
 */

public class Login1PresenterImp implements Login1Presenter
{
    private Login1ActView login1ActView;
    public Login1PresenterImp(Login1ActView login1ActView)
    {
        this.login1ActView=login1ActView;
    }
    @Override
    public void login(String userName, String passWord)
    {
        //模拟登录(Mock login)
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                boolean isSuccess=true;//根据实际情况判断
                if (login1ActView==null)
                    return;
                if (isSuccess)
                {
                    login1ActView.loginSuccess("the result get from your server");
                }
                else
                {
                    login1ActView.loginFailed("error code","error body");
                }
            }
        }, 2000);
    }
}
