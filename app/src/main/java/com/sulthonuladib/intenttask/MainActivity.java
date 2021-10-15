package com.sulthonuladib.intenttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aksi implicit intent
        final EditText _etWebUrl = (EditText)findViewById(R.id.etWebUrl);
        Button _btImplicit = (Button)findViewById(R.id.btImplicit);

        _btImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = _etWebUrl.getText().toString();
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(implicitIntent);
            }
        });

        // Aksi Explicit Intent

        Button btExplicit = (Button)findViewById(R.id.btExplicit);
        btExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destination = new Intent( getApplicationContext(), DestinationActivity.class);
                startActivity(destination);
            }

        });
    }
}