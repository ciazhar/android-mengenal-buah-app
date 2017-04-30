package com.ciazhar.coba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Manggis extends AppCompatActivity {

    EditText editTextmanggis;
    Button bt_proses;
    TextView hasil;
    String benar = "manggis";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manggis);

        editTextmanggis = (EditText)findViewById(R.id.edt_buah_manggis);
        bt_proses = (Button)findViewById(R.id.bt_proses_manggis);
        hasil = (TextView)findViewById(R.id.hasil_manggis);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextmanggis.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextmanggis.getText().toString().toLowerCase(); //mengambil nilai dari editTextmanggis
                    if (jawaban.equals(benar)){ // membandingkat masukan dengan ketentuan benar  ".equals()" membandingkan nilai String yang tersimpan.
                        String keterangan = "Anda benar";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasil.setText(keterangan);
                    }
                }

            }
        });

    }
}
