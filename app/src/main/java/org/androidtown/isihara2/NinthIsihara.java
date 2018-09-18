package org.androidtown.isihara2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class NinthIsihara extends ActionBarActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_isihara);

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
        Intent intent = new Intent(NinthIsihara.this, EighthIsihara.class);
        Intent none = new Intent(NinthIsihara.this, ResultNone.class);
        Intent mang = new Intent(NinthIsihara.this, ResultMang.class);
        Intent aik = new Intent(NinthIsihara.this, ResultAik.class);
        Intent all = new Intent(NinthIsihara.this, ResultAll.class);

        switch(v.getId())
        {
            case R.id.btl:
                FirstIsihara.none--;
                break;
            case R.id.btc:
                FirstIsihara.mang++;
                FirstIsihara.aik++;
                break;
            case R.id.btr:
                FirstIsihara.all--;
                break;
            case R.id.back:
                startActivity(intent);
                break;
        }

        if(FirstIsihara.none <= 0)
        {
            startActivity(none);
        }
        else if(FirstIsihara.all <= 0)
        {
            startActivity(all);
        }
        else if(FirstIsihara.mang > FirstIsihara.aik)
        {
            startActivity(mang);
        }
        else if(FirstIsihara.aik > FirstIsihara.mang)
        {
            startActivity(aik);
        }
    }
}
