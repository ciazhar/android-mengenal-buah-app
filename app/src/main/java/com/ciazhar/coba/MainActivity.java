package com.ciazhar.coba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView alpukat,apel, ceri, durian, jambuair, manggis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alpukat=(ImageView)findViewById(R.id.alpukat);
        alpukat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Alpukat.class);
                startActivity(intent);
            }
        });

        apel=(ImageView)findViewById(R.id.apel);
        apel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Apel.class);
                startActivity(intent);
            }
        });

        ceri=(ImageView)findViewById(R.id.ceri);
        ceri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Ceri.class);
                startActivity(intent);
            }
        });

        durian=(ImageView)findViewById(R.id.durian);
        durian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Durian.class);
                startActivity(intent);
            }
        });

        jambuair=(ImageView)findViewById(R.id.jambuair);
        jambuair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, JambuAir.class);
                startActivity(intent);
            }
        });

        manggis=(ImageView)findViewById(R.id.manggis);
        manggis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Manggis.class);
                startActivity(intent);
            }
        });
    }

}
