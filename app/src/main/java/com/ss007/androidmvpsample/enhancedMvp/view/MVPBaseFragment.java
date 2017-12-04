package com.ss007.androidmvpsample.enhancedMvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ss007.androidmvpsample.BaseFragment;
import com.ss007.androidmvpsample.enhancedMvp.presenter.impInterface.BasePresenter;

/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:17
 * @description
 */

public abstract class MVPBaseFragment<V,T extends BasePresenter<V>>  extends BaseFragment
{
    private final static  String TAG=MVPBaseFragment.class.getSimpleName();
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mPresenter=createPresenter();
        mPresenter.attachView((V) this);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
