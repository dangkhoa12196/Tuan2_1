package com.example.student.tuan2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void bt_tong(View v)
    {
        EditText editnuma=(EditText)findViewById(R.id.editnuma);
        int a=Integer.parseInt(editnuma.getText()+"");

        EditText editnumb=(EditText)findViewById(R.id.editnumb);
        int b=Integer.parseInt(editnuma.getText()+"");

        TextView tv=(TextView) findViewById(R.id.tv);
        tv.setText((a+b)+"");


    }
    public void bt_hieu(View v)
    {
        EditText editnuma=(EditText)findViewById(R.id.editnuma);
        int a=Integer.parseInt(editnuma.getText()+"");

        EditText editnumb=(EditText)findViewById(R.id.editnumb);
        int b=Integer.parseInt(editnuma.getText()+"");

        TextView tv=(TextView) findViewById(R.id.tv);
        tv.setText((a-b)+"");


    }
    public void bt_tich(View v)
    {
        EditText editnuma=(EditText)findViewById(R.id.editnuma);
        int a=Integer.parseInt(editnuma.getText()+"");

        EditText editnumb=(EditText)findViewById(R.id.editnumb);
        int b=Integer.parseInt(editnuma.getText()+"");

        TextView tv=(TextView) findViewById(R.id.tv);
        tv.setText((a*b)+"");


    }
    public void bt_thuong(View v)
    {
        EditText editnuma=(EditText)findViewById(R.id.editnuma);
        int a=Integer.parseInt(editnuma.getText()+"");

        EditText editnumb=(EditText)findViewById(R.id.editnumb);
        int b=Integer.parseInt(editnuma.getText()+"");

        TextView tv=(TextView) findViewById(R.id.tv);
        tv.setText((a/b)+"");


    }
    public void bt_thoat(View v)
    {
       finish();


    }

}
