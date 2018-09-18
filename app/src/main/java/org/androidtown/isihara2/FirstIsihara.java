package org.androidtown.isihara2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FirstIsihara extends ActionBarActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    public static int none;
    public static int mang;
    public static int aik;
    public static int all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        none = 9;
        mang = 0;
        aik = 0;
        all = 9;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_isihara);

        /*ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.isihara1);
        setContentView(image);*/

        button1 = (Button) findViewById(R.id.btl);
        button2 = (Button) findViewById(R.id.btc);
        button3 = (Button) findViewById(R.id.btr);
        button4 = (Button) findViewById(R.id.back);
        button5 = (Button) findViewById(R.id.front);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_isihara, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(FirstIsihara.this, SecondIsihara.class);

        switch(v.getId()) {
            case R.id.btl:
                none--;
                startActivity(intent);
                break;
            case R.id.btc:
                aik++;
                startActivity(intent);
                break;
            case R.id.btr:
                all--;
                startActivity(intent);
                break;
            case R.id.back:
                startActivity(intent);
                break;
            case R.id.front:
                none--;
                all--;
                startActivity(intent);
                break;
        }
    }

    /*public void setState1(int none)
    {
        this.none = none;
    }

    public int getState1()
    {
        return none;
    }

    public void setState2(int mang)
    {
        this.mang = mang;
    }

    public int getState2()
    {
        return mang;
    }

    public void setState3(int aik)
    {
        this.aik = aik;
    }

    public int getState3()
    {
        return aik;
    }

    public void setState4(int all)
    {
        this.all = all;
    }

    public int getState4()
    {
        return all;
    }*/
}
