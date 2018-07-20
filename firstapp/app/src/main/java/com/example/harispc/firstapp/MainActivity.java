package com.example.harispc.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button b1login;
    Button b2register;
    Button b3Menu;
    Button b4Camera;
    Button b5Goggle;
    Button b6Call;
    Button b8facebook;
    Button b9exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1login=(Button) findViewById(R.id.btlogin);
        b2register=(Button) findViewById(R.id.btRegister);
        b3Menu=(Button) findViewById(R.id.btMenu);
        b4Camera=(Button) findViewById(R.id.btCamera);
        b5Goggle=(Button)findViewById(R.id.btgoogleMap);
        b6Call = (Button)findViewById(R.id.btCall);
        b8facebook = (Button)findViewById(R.id.btFacebook);
        b9exit = (Button)findViewById(R.id.btExit);

        b1login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(MainActivity.this,LOGIN.class);
                startActivity(LoginIntent);
            }
        });

        b2register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterIntent = new Intent(MainActivity.this,Register.class);
                startActivity(RegisterIntent);
            }
        });

        b3Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenuIntent = new Intent(MainActivity.this,Menu.class);
                startActivity(MenuIntent);
            }
        });

        b4Camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CameraIntend = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(CameraIntend);
            }
        });
        b5Goggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.862700, 67.090768"));
                startActivity(googleIntent);
            }
        });

        b6Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:03212870389"));
                startActivity(callIntent);
            }
        });
        b8facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(facebookIntent);
            }
        });

        b9exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
