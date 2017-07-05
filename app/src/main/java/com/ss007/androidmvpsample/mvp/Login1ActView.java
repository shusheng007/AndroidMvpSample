package com.ss007.androidmvpsample.mvp;

/**
 * Copyright (C) 2017
 *
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:29
 * @description
 */

public interface Login1ActView
{
    void loginSuccess(String responseStr);
    void loginFailed(String code,String errBody);
}
