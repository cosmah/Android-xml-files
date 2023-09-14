package com.cosmah.android_xml_files;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txtHello);
        txtHello.setText(getString(R.string.Hello));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

}