package com.ss007.androidmvpsample.enhancedMvp.presenter.impInterface;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Copyright (C) 2017 ben
 *
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:34
 * @description
 */

public class BasePresenter<V>
{
    protected Reference<V> mViewRef;
    protected V mView;

    public void attachView(V view)
    {
        mViewRef = new WeakReference<V>(view);
        mView = mViewRef.get();
    }

    public V getView()
    {
        if (mViewRef == null)
        {
            return null;
        }
        return mViewRef.get();
    }

    public boolean isViewAttached()
    {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView()
    {
        if (mViewRef != null)
        {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
