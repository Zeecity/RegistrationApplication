package com.zeecity.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //access activitymain by ralation

    }

    public void onBtnClick (View view){
        TextView txtFn = findViewById(R.id.txtFnameDis);
        EditText edtTxtFname = findViewById(R.id.txtFname);
        txtFn.setText("Firstname: " + edtTxtFname.getText().toString());

        TextView txtLn = findViewById(R.id.txtLnameDis);
        EditText edtTxtLname = findViewById(R.id.txtLname);
        txtLn.setText("Lastname: " + edtTxtLname.getText().toString());

        TextView txtEm = findViewById(R.id.txtEmailDis);
        EditText edtTxtEmail = findViewById(R.id.txtEmail);
        txtEm.setText("Email: " + edtTxtEmail.getText().toString());

    }
}

//types of files
//xml = layout of the application
//java = logic of the application