package com.androidlime.health_tips;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    Button button, button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.qoq);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

       

        button = (Button) findViewById(R.id.btn33);
        button3= (Button) findViewById(R.id.btn34);

        button1= (Button) findViewById(R.id.facebook);
        button2= (Button) findViewById(R.id.gmail);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, scend2Activity.class);
                startActivity(intent);


                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in =new Intent(MainActivity.this,Main3Activity.class);
                        startActivity(in);
                    }
                });


                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ip = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                        startActivity(ip);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
                        startActivity(in);
                    }
                });


            }
        });
    }

    @Override
    public void onClick(View v) {

    }
    @Override
    public void onBackPressed() {


        AlertDialog.Builder alerDialogBuilder;
        alerDialogBuilder = new AlertDialog.Builder(MainActivity.this);


        alerDialogBuilder.setIcon(R.drawable.dialog);
        alerDialogBuilder.setTitle(R.string.title_text);
        alerDialogBuilder.setMessage(R.string.message_text);


        alerDialogBuilder.setCancelable(false);
        alerDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alerDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alerDialogBuilder.create();
        alertDialog.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.about) {

            Intent i = new Intent(MainActivity.this,menu_Activity.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}

