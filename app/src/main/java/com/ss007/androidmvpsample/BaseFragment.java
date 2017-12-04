package com.ss007.androidmvpsample;

import android.support.v4.app.Fragment;

/**
 * Copyright (C) 2017 在线回声（天津）科技发展有限公司
 * 在线回声完全享有此软件的著作权，违者必究
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:12
 * @description
 */
public class BaseFragment extends Fragment
{
    @Override
    public void onResume()
    {
        //可加入统计代码
        super.onResume();
    }

    @Override
    public void onPause()
    {
        super.onPause();
    }
}
