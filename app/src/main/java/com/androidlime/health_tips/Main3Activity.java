package com.androidlime.health_tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button Tips16,Tips17,Tips18,Tips19,Tips20,Tips21,Tips22,Tips23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Tips16= (Button) findViewById(R.id.btn51);
        Tips17= (Button) findViewById(R.id.btn52);
        Tips18= (Button) findViewById(R.id.btn53);
        Tips19= (Button) findViewById(R.id.btn54);
        Tips20= (Button) findViewById(R.id.btn55);
        Tips21= (Button) findViewById(R.id.btn56);
        Tips22= (Button) findViewById(R.id.btn57);
        Tips23= (Button) findViewById(R.id.btn58);

        Tips16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Main3Activity.this,Tips_16.class);
                startActivity(i);
            }
        });

        Tips17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this,Tips_17.class);
                startActivity(intent);
            }
        });


        Tips18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i0 =new Intent(Main3Activity.this,Tips_18.class);
                startActivity(i0);
            }
        });


        Tips19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ro=new Intent(Main3Activity.this,Tips_19.class);
                startActivity(ro);

            }
        });


        Tips20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent yoy=new Intent(Main3Activity.this,Tips_20.class);
                startActivity(yoy);
            }
        });


        Tips21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yoye=new Intent(Main3Activity.this,Tips_21.class);
                startActivity(yoye);
            }
        });

        Tips22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yoy=new Intent(Main3Activity.this,Tips_22.class);
                startActivity(yoy);
            }
        });
        Tips23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yy=new Intent(Main3Activity.this,Tips_23.class);
                startActivity(yy);
            }
        });
    }
}
