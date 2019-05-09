package com.example.aphro10.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLog(View view){
        EditText username = (EditText) findViewById(R.id.textUsername);
        EditText password = (EditText) findViewById(R.id.textPassword);
        String user = username.getText().toString();
        String pass = password.getText().toString();
        /*Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);*/
        if (user.equals("Claudine") && pass.equals("Claudine")) {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Please enter valid credential which is Claudine for both",Toast.LENGTH_LONG).show();
        }
    }
    public void Register(View view){
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);

    }

}
