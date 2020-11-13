package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Locale;

public class List_Graph extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    static int rowNum = 0;

    static String table[][] = new String[100][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__graph);

        // TableLayoutのグループを取得
        ViewGroup vg = (ViewGroup)findViewById(R.id.TableLayout1);
        // 行を追加
        getLayoutInflater().inflate(R.layout.table_row, vg);
        // 文字設定
        TableRow tr = (TableRow)vg.getChildAt(0);
//            String str = String.format(Locale.getDefault(), "raw%d", i+1);
        String str1 = "日付";
        String str2 = "内容";
        String str3 = "金額";
        ((TextView)(tr.getChildAt(0))).setText(str1);
        ((TextView)(tr.getChildAt(1))).setText(str2);
        ((TextView)(tr.getChildAt(2))).setText(str3);

        table[rowNum][0] = MainActivity.date;
        table[rowNum][1] = MainActivity.naiyo;
        table[rowNum][2] = MainActivity.kingaku;
        rowNum++;

        for (int i=0; i<rowNum; i++) {

            // 行を追加
            getLayoutInflater().inflate(R.layout.table_row, vg);
            // 文字設定
            TableRow tr1 = (TableRow)vg.getChildAt(i+1);
            String str = String.format(Locale.getDefault(), "raw%d", i+1);

            ((TextView)(tr1.getChildAt(0))).setText(table[i][0]);
            ((TextView)(tr1.getChildAt(1))).setText(table[i][1]);
            ((TextView)(tr1.getChildAt(2))).setText(table[i][2]);
        }

    }
}