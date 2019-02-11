package com.example.user.implicitintent;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code);
    }

    public void cmraclick(View view) {

        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
      //  startActivityForResult(getPickImageChooserIntent(), 200);
        startActivity(cameraIntent);


    }



        public void phnclick(View view) {

        Intent i = new Intent(Intent.ACTION_DIAL);
       // String p = "tel:" + getString(R.string.phone_number);
       // i.setData(Uri.parse(p));
        startActivity(i);

    }

    public void smsclick(View view) {
        String phoneNumber = "+880xxxxxxxxxx";
        //String message = "Welcome to sms";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phoneNumber));
        //intent.putExtra("sms_body", message);
        startActivity(intent);

    }

    public void webclick(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.yourURL.com"));
        startActivity(intent);
    }
}
