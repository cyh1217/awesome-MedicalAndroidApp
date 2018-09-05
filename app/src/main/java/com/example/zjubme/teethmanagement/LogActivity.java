package com.example.zjubme.teethmanagement;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogActivity extends AppCompatActivity {
    private int countSeconds = 60;
    private EditText mobile_login,yan_zheng_ma;
    private Button getCaptcha, loginButton;
    private Context myComtext;
    private String usersuccess;
    private Handler myCountHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        TextView getCaptcha = (TextView) findViewById(R.id.getCaptcha);
        getCaptcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
