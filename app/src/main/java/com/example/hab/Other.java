package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Other extends AppCompatActivity {

    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    public static String subdate;
    public static String subnaiyo;
    public static String subkingaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button sisyuButton = (Button)findViewById(R.id.Sisyutubutton);
        sisyuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Other.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button TButton = (Button)findViewById(R.id.subbutton);

        editText4 = findViewById(R.id.Date);
        editText5 = findViewById(R.id.Naiyou);
        editText6 = findViewById(R.id.Kingagku);

        TButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // エディットテキストのテキストを取得
                subdate = editText4.getText().toString();
                subnaiyo = editText5.getText().toString();
                subkingaku = editText6.getText().toString();

                Intent intent = new Intent(Other.this,SubList_Graph.class);
                startActivity(intent);
            }
        });
    }
}