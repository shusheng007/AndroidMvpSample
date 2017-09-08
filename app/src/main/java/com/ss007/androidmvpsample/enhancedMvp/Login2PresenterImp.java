package com.ss007.androidmvpsample.enhancedMvp;

import android.os.Handler;

/**
 * Copyright (C) 2017  ben
 *
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:40
 * @description
 */

public class Login2PresenterImp extends BasePresenter<Login2ActView> implements Login2Presenter
{
    @Override
    public void login(String userName, String passWord)
    {
        final Login2ActView login2ActView= getView();
        //模拟登录(Mock login)
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                boolean isSuccess=true;//depend on result from your server
                if (login2ActView==null)
                    return;
                if (isSuccess)
                {
                    login2ActView.loginSuccess("the result get from your server");
                }
                else
                {
                    login2ActView.loginFailed("error code","error body");
                }
            }
        }, 2000);
    }
}
