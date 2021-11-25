package com.example.testws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testws.ui.login.LoginActivity;


public class Onboarding extends AppCompatActivity {

//    private Button btn_alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

    }
    public void onBtnAlert(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

//    public void addListenerOnButton(View view) {
//        btn_alert = (Button) findViewById(R.id.btn_alert);
//
//        btn_alert.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(".ui.login.LoginActivity");
//                        startActivity(intent);
//                    }
//                }
//        );
//    }


}