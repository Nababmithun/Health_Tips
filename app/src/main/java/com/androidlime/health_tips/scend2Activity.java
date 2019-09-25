package com.androidlime.health_tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scend2Activity extends AppCompatActivity {

    Button Tips1,Tips2,Tips3,Tips4,Tips5,Tips6,Tips7,Tips8,Tips9,Tips10,Tips11,Tips12,Tips13,Tips14,Tips15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scend2);

        Tips1= (Button) findViewById(R.id.btn1);
        Tips2= (Button) findViewById(R.id.btn2);
        Tips3= (Button) findViewById(R.id.btn3);
        Tips4= (Button) findViewById(R.id.btn4);
        Tips5= (Button) findViewById(R.id.btn5);
        Tips6= (Button) findViewById(R.id.btn6);
        Tips7= (Button) findViewById(R.id.btn7);
        Tips8= (Button) findViewById(R.id.btn8);
        Tips9= (Button) findViewById(R.id.btn9);
        Tips10= (Button) findViewById(R.id.btn10);
        Tips11= (Button) findViewById(R.id.btn11);
        Tips12= (Button) findViewById(R.id.btn12);
        Tips13= (Button) findViewById(R.id.btn13);
        Tips14= (Button) findViewById(R.id.btn14);
        Tips15= (Button) findViewById(R.id.btn15);





        Tips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(scend2Activity.this,Tips_1.class);
                startActivity(i);
            }
        });

        Tips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t =new Intent(scend2Activity.this,Tips_2.class);
                startActivity(t);
            }
        });


        Tips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h =new Intent(scend2Activity.this,Tips_3.class);
                startActivity(h);
            }
        });


        Tips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j =new Intent(scend2Activity.this,Tips_4.class);
                startActivity(j);
            }
        });

        Tips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k =new Intent(scend2Activity.this,Tips_5.class);
                startActivity(k);
            }
        });
        Tips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l =new Intent(scend2Activity.this,Tips_6.class);
                startActivity(l);
            }
        });


        Tips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z =new Intent(scend2Activity.this,Tips_7.class);
                startActivity(z);
            }
        });

        Tips8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n =new Intent(scend2Activity.this,Tips_8.class);
                startActivity(n);
            }
        });
        Tips9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m =new Intent(scend2Activity.this,Tips_9.class);
                startActivity(m);
            }
        });
        Tips10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent no =new Intent(scend2Activity.this,Tips_10.class);
                startActivity(no);
            }
        });
        Tips11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent non =new Intent(scend2Activity.this,Tips_11.class);
                startActivity(non);
            }
        });
        Tips12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nono =new Intent(scend2Activity.this,Tips_12.class);
                startActivity(nono);
            }
        });
        Tips13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonol =new Intent(scend2Activity.this,Tips_13.class);
                startActivity(nonol);
            }
        });
        Tips14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonoll =new Intent(scend2Activity.this,Tips_14.class);
                startActivity(nonoll);
            }
        });
        Tips15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonollo =new Intent(scend2Activity.this,Tips_15.class);
                startActivity(nonollo);
            }
        });
    }
}
