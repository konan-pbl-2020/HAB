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
    private EditText editText2;
    private EditText editText3;
    public static String date;
    public static String naiyo;
    public static String kingaku;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button syuButton = (Button)findViewById(R.id.Syunyubutton);
        syuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Other.class);
                startActivity(intent);
            }
        });

        Button touButton = (Button)findViewById(R.id.Tourokubutton);

        editText = findViewById(R.id.Date);
        editText2 = findViewById(R.id.Naiyou);
        editText3 = findViewById(R.id.Kingagku);


        touButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // エディットテキストのテキストを取得
                date = editText.getText().toString();
                naiyo = editText2.getText().toString();
                kingaku = editText3.getText().toString();

                Intent intent = new Intent(MainActivity.this,List_Graph.class);
                startActivity(intent);
            }
        });
    }

}
