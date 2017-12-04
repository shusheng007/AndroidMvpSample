package com.ss007.androidmvpsample.enhancedMvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ss007.androidmvpsample.R;
import com.ss007.androidmvpsample.enhancedMvp.presenter.impInterface.MyFamilyPreImp;
import com.ss007.androidmvpsample.enhancedMvp.view.viewInterfaces.MyFamilyView;

/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:34
 * @description
 */

public class MyFamilyFrg extends MVPBaseFragment<MyFamilyView,MyFamilyPreImp> implements MyFamilyView
{
    private static final String TAG= MyFamilyFrg.class.getSimpleName();
    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.frg_myfamily,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        imageView=view.findViewById(R.id.imageView);
        if (mPresenter!=null)
            mPresenter.getMyFamilyPic();
    }

    @Override
    protected MyFamilyPreImp createPresenter()
    {
        return new MyFamilyPreImp();
    }

    @Override
    public void callServerFailedCallback(String interfaceName, String errCode, String errBody)
    {
        switch (interfaceName)
        {
            case "getMyFamily":
                if (errCode.equals("xxx"))
                {
                    //根据不同的错误码做相应的处理
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void callServerNetErrorCallback(String interfaceName, Throwable e)
    {
         Log.d(TAG,"网络错误",e);
    }

    @Override
    public void getMyFamilyCallback(int imgId)
    {
        imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(),imgId));
    }
}
