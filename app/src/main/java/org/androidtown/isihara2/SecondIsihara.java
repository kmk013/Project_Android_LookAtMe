package org.androidtown.isihara2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class SecondIsihara extends ActionBarActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_isihara);

        //button1 = (Button) findViewById(R.id.btl);
        //button2 = (Button) findViewById(R.id.btc);
        //button3 = (Button) findViewById(R.id.btr);
        //button4 = (Button) findViewById(R.id.back); // activity_first_isihara.xml에 있는 버튼 아이디와 겹침.

        //button1.setOnClickListener(this);
        //button2.setOnClickListener(this);
        //button3.setOnClickListener(this);
        //button4.setOnClickListener(this);
    }

    public void onClick(View v)
    {

        Intent intent = new Intent(SecondIsihara.this, ThirdIsihara.class);
        Intent intent1 = new Intent(SecondIsihara.this, FirstIsihara.class);

        switch(v.getId())
        {
            case R.id.btl:
                FirstIsihara.none--;
                startActivity(intent);
                break;
            case R.id.btr:
                FirstIsihara.aik++;
                FirstIsihara.mang++;
                FirstIsihara.all--;
                startActivity(intent);
                break;
            case R.id.back:
                FirstIsihara.none++;
                FirstIsihara.all++;
                startActivity(intent1);
                break;
            case R.id.front:
                FirstIsihara.none--;
                FirstIsihara.all--;
                startActivity(intent);
                break;
        }
    }
}
