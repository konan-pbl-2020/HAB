package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class List_Graph extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    String date = MainActivity.date;
    String naiyo = MainActivity.naiyo;
    String kingaku = MainActivity.kingaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__graph);

        date = editText.getText().toString();
        textView.setText(date);
    }
}