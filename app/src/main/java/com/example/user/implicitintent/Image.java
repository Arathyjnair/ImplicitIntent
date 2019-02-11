package com.example.user.implicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    public void phoneclick(View view) {
        Intent intnt=new Intent(Image.this,code.class);
        startActivity(intnt);
    }
}
