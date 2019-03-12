package com.example.user.hamkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.hamkar.User.RegisterUser;

public class MainActivity extends AppCompatActivity {

    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnregister = (Button)findViewById(R.id.btnRegister);
    }

   public void Userregister(View view)
    {
        Intent intent = new Intent(this,RegisterUser.class);
        startActivity(intent);
    }
}
