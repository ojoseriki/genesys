package com.example.st.genesys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginPage extends AppCompatActivity implements View.OnClickListener {
 Button log;
 EditText user,pass;
 TextView regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        regis = (TextView) findViewById(R.id.register_text);
        user = (EditText) findViewById(R.id.user_edit);
        pass = (EditText) findViewById(R.id.passowrd_edit);
        log = (Button) findViewById(R.id.login_btn);

         log.setOnClickListener(this);
         regis.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_btn:
                startActivity(new Intent(loginPage.this, Homepage.class));
                break;
            case  R.id.register_text:
               startActivity(new Intent(loginPage.this, DecidePage.class));
                break;
        }

    }
}
