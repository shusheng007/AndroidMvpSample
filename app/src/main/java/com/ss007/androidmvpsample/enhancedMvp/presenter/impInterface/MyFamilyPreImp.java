package com.ss007.androidmvpsample.enhancedMvp.presenter.impInterface;

import android.os.Handler;

import com.ss007.androidmvpsample.R;
import com.ss007.androidmvpsample.enhancedMvp.presenter.MyFamilyPre;
import com.ss007.androidmvpsample.enhancedMvp.view.viewInterfaces.MyFamilyView;

/**
 * Copyright (C) 2017
 *
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:42
 * @description
 */

public class MyFamilyPreImp extends BasePresenter<MyFamilyView>implements MyFamilyPre
{
    @Override
    public void getMyFamilyPic()
    {
        //模拟从网上获取图片资源(Mock get image from remote server)
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                boolean isFeedbackFromServer=true;//depend on result from your server
                boolean isNetError=false;//net error
                if (getView()==null)
                    return;
                if (isFeedbackFromServer)
                {
                    getView().getMyFamilyCallback(R.drawable.my_family);
                }
                else
                {
                    getView().callServerFailedCallback("getMyFamily","error code","error body");
                }
                //模拟网络请求失败的情况（网络连接超时，读取超时等情况）
//                if (isNetError)
//                    getView().callServerNetErrorCallback("getMyFamily",null);
            }
        }, 2000);
    }
}
