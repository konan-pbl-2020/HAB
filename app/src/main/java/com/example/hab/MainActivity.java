package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button etuButton = (Button)findViewById(R.id.Eturanbottun);
        etuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,List_Graph.class);
                startActivity(intent);
            }
        });
        Button syuButton = (Button)findViewById(R.id.Syunyubutton);
        syuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Other.class);
                startActivity(intent);
            }
        });
    }
}