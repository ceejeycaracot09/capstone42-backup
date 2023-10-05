package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jobconnectui.Freelance.Profile_Hirer_Menu;

public class JobSeeker_Menu extends AppCompatActivity {

    TextView logout;

    TextView view_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hirer_menu);

        logout = findViewById(R.id.logout);
        view_profile = findViewById(R.id.view_profile);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JobSeeker_Menu.this, SignIn.class));
                Toast.makeText(JobSeeker_Menu.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

        view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(JobSeeker_Menu.this, Profile_Hirer.class));
            }
        });
    }
}