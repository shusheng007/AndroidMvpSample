package com.ss007.androidmvpsample.enhancedMvp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ss007.androidmvpsample.R;

public class Login2Act extends MVPBaseActivity<Login2Act,Login2PresenterImp> implements Login2ActView
{
    private final static String TAG = Login2Act.class.getSimpleName();

    private EditText userName, passWord;
    private Button btnLogin;
    private Activity mAct;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mAct = this;
        userName = (EditText) findViewById(R.id.et_user_name);
        passWord = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(clickListener);
    }

    @Override
    protected Login2PresenterImp createPresenter()
    {
        return new Login2PresenterImp();
    }

    @Override
    public void loginSuccess(String responseStr)
    {
        btnLogin.setText("Login");
        Log.d(TAG, String.format("result: %s", responseStr));
        Toast.makeText(mAct, "login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(String code, String errBody)
    {
        Log.d(TAG, String.format("error code:%s | error body: %s", code, errBody));
        Toast.makeText(mAct, "login failed", Toast.LENGTH_SHORT).show();
    }
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.btn_login:
                    if (mPresenter != null)
                    {
                        btnLogin.setText("Loginning ...");
                        mPresenter.login(userName.getText().toString(), passWord.getText().toString());
                    }

                    break;
                default:
                    break;
            }
        }
    };
}
