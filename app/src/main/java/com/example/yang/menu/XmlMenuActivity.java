package com.example.yang.menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class XmlMenuActivity extends AppCompatActivity {
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_menu);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        txt=(TextView) findViewById(R.id.txt);
        MenuInflater inflater = new MenuInflater(this);//菜单动态加载类
        inflater.inflate(R.menu.xml_menu,menu);//调用inflate方法解析菜单文件
        super.onCreateOptionsMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        switch (mi.getItemId()){
            case R.id.font_10:
                txt.setTextSize(10);
                break;
            case R.id.font_16:
                txt.setTextSize(16);
                break;
            case R.id.font_20:
                txt.setTextSize(20);
                break;
            case R.id.color_red:
                txt.setTextColor(Color.RED);
                break;
            case R.id.color_black:
                txt.setTextColor(Color.BLACK);
                break;
            case R.id.it2:
                Toast toast=Toast.makeText(XmlMenuActivity.this,"这是普通单击项",Toast.LENGTH_SHORT);
                toast.show();
        }
        return true;
    }
}
