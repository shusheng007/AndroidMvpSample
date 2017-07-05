package com.ss007.androidmvpsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ss007.androidmvpsample.enhancedMvp.Login2Act;
import com.ss007.androidmvpsample.mvp.Login1Act;

public class MainActivity extends BaseActivity
{
    private static final String TAG=MainActivity.class.getSimpleName();
    private MainActivity mAct;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mAct=this;
        Button btnMvp= (Button) findViewById(R.id.btn1);
        Button btnMvpEnhance= (Button) findViewById(R.id.btn2);
        btnMvp.setOnClickListener(viewClickListener);
        btnMvpEnhance.setOnClickListener(viewClickListener);
    }

    private View.OnClickListener viewClickListener=new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.btn1:
                    Intent intent1=new Intent(mAct, Login1Act.class);
                    startActivity(intent1);
                    break;
                case R.id.btn2:
                    Intent intent2=new Intent(mAct, Login2Act.class);
                    startActivity(intent2);
                    break;
                default:
                    break;
            }
        }
    };
}
