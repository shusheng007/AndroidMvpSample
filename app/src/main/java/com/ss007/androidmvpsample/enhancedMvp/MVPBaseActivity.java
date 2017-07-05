package com.ss007.androidmvpsample.enhancedMvp;

import android.os.Bundle;

import com.ss007.androidmvpsample.BaseActivity;

/**
 * Copyright (C) 2017
 *
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:32
 * @description
 */

public abstract class MVPBaseActivity<V,T extends BasePresenter<V>> extends BaseActivity
{
    protected T mPresenter;

    @Override
    protected void onCreate(Bundle arg)
    {
        super.onCreate(arg);
        mPresenter=createPresenter();
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
