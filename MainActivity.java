package com.example.backgroudserviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().equals("Started")){
                    text.setText("Stopped");
                    stopService(new Intent(MainActivity.this,BgService.class));
                }else {
                    text.setText("Started");
                    startService(new Intent(MainActivity.this,BgService.class));
                }
            }
        });
    }
}
