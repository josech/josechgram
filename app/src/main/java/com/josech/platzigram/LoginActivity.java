package com.josech.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.josech.platzigram.view.ContainerActivity;
import com.josech.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goContainer(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    public void goPaginaWeb(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/josech/josechgram"));
        startActivity(intent);
    }
}
