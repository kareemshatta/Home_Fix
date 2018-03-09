package com.example.mahmoud.home__fix;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by karimakos on 01/11/2017.
 */

public class RegistrationActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, View.OnClickListener {

    private EditText etEmail, etPassword, etConfirmPassword, etName;
    private Button btnSelectDate, btnRegister;
    private Spinner  spcity,sparea;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etEmail = (EditText)findViewById(R.id.et_email);
        etName = (EditText)findViewById(R.id.et_name);
        etPassword = (EditText)findViewById(R.id.et_password);
        etConfirmPassword = (EditText)findViewById(R.id.et_confirm_password);
        spcity = (Spinner) findViewById(R.id.sp_city);
        sparea = (Spinner) findViewById(R.id.sp_area);
        btnRegister = (Button)findViewById(R.id.btn_register);
        btnSelectDate = (Button)findViewById(R.id.btn_date);

        btnSelectDate.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.btn_date) {
            DialogFragment newFragment = new DatePickerFragment();
            newFragment.show(getSupportFragmentManager(), "datePicker");
        } else {
            registerNewUser();
        }
    }


    String name;
    String city;
    String area;

    private void registerNewUser() {
        name = etName.getText().toString();
        city = spcity.getSelectedItem().toString();
        area = sparea.getSelectedItem().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String confirmPassword = etConfirmPassword.getText().toString();

    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int selectedDay) {
        int selectedMonth = month + 1;

        btnSelectDate.setText(selectedDay + "/" + selectedMonth + "/" + year);

}




}