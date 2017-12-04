package com.ss007.androidmvpsample.enhancedMvp.view.viewInterfaces;

/**
 * Copyright (C) 2017
 *
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:38
 * @description
 */

public interface MyFamilyView
{
    void callServerFailedCallback(String interfaceName, String errCode, String errBody);

    void callServerNetErrorCallback(String interfaceName, Throwable e);

    void getMyFamilyCallback(int imgId);
}
