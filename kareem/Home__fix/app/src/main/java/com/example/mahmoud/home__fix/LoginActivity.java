package com.example.mahmoud.home__fix;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by karimakos on 31/10/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvForgetPassword, btnRegister;

    private EditText etEmail, etPassword;

    private Button btnLogin;



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvForgetPassword = (TextView) findViewById(R.id.tv_forget_password);
        btnRegister = (TextView) findViewById(R.id.tv_register);
        etEmail = (EditText) findViewById(R.id.et_login);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(this);
        tvForgetPassword.setPaintFlags(tvForgetPassword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tvForgetPassword.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_forget_password) {
            final Dialog dialog = new Dialog(this);

            dialog.setContentView(R.layout.activity_dilod_forget_password);

            Window dialogWindow = dialog.getWindow();

            if (dialogWindow != null) {
                dialog.getWindow().getAttributes().width = getResources().getDisplayMetrics().widthPixels;
            }

            Button btnSend = (Button) dialog.findViewById(R.id.btn_send);

            final EditText etEmail = (EditText) dialog.findViewById(R.id.et_shownumb);

            btnSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = etEmail.getText().toString();

                    if (email.isEmpty()) {
                        etEmail.setError("Enter Email Address");
                    } else {
                        dialog.dismiss();
                        //    sendForgetPasswordEmail(email);
                    }
                }
            });

            dialog.show();
        } else if (v.getId() == R.id.tv_register) {
            Intent i = new Intent(this, RegistrationActivity.class);
            startActivity(i);
            finish();
        } else if (v.getId() == R.id.btn_login) {
          ////////
        }
    }










}
