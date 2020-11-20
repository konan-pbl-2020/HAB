package com.example.hab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Locale;

import static java.lang.Integer.parseInt;

public class List_Graph extends AppCompatActivity {

    private TextView textView;
    private TextView textView5;
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
        String str1 = "日付        ";
        String str2 = "内容          ";
        String str3 = "金額";
        TextView tv1 = ((TextView)(tr.getChildAt(0)));
        tv1.setTextSize(30.0f);
        tv1.setText(str1);

        TextView tv2 = ((TextView)(tr.getChildAt(1)));
        tv2.setTextSize(30.0f);
        tv2.setText(str2);

        TextView tv3 = ((TextView)(tr.getChildAt(2)));
        tv3.setTextSize(30.0f);
        tv3.setText(str3);
        //tv1.setTextColor();

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

            TextView tv01 = ((TextView)(tr1.getChildAt(0)));
            tv01.setTextSize(30.0f);
            tv01.setText(table[i][0]);
            TextView tv02 = ((TextView)(tr1.getChildAt(1)));
            tv02.setTextSize(30.0f);
            tv02.setText(table[i][1]);
            TextView tv03 = ((TextView)(tr1.getChildAt(2)));
            tv03.setTextSize(30.0f);
            tv03.setText(table[i][2]);
        }

        int sum = 0;
        for (int i=0; i<rowNum; i++){
            int num = parseInt(table[i][2]);
            sum += num;
        }
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setText(String.valueOf(sum));


    }
}