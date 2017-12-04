package com.ss007.androidmvpsample.enhancedMvp.view;

import android.os.Bundle;

import com.ss007.androidmvpsample.BaseActivity;
import com.ss007.androidmvpsample.R;
/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @modifier
 * @createDate 2017/12/4 11:22
 * @description
 */

public class MyFamilyAct extends BaseActivity
{
    private static final String TAG=MyFamilyAct.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_myfamily);
        MyFamilyFrg familyFrg=new MyFamilyFrg();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.rl_container,familyFrg)
                .commit();
    }

}
