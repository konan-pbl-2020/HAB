package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

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

        editText = findViewById(R.id.Date);

        textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.Tourokubutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // エディットテキストのテキストを取得
                String text = editText.getText().toString();
                // 取得したテキストを TextView に張り付ける
                textView.setText(text);
            }
        });
    }

}
