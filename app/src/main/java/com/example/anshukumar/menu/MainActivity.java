package com.example.anshukumar.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx1,tx2,tx3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1= (TextView) findViewById(R.id.textView);
        tx2= (TextView) findViewById(R.id.textView2);
        tx3= (TextView) findViewById(R.id.textView3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item:
                tx1.setBackgroundColor(0xffff0000);
                break;
            case R.id.item1:
                tx2.setBackgroundColor(0xff0000ff);
                break;
            case R.id.item2:
                tx3.setBackgroundColor(0xff000000);
                break;
        }
        return true;
    }
}
