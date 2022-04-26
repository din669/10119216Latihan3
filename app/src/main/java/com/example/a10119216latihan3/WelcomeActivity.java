package com.example.a10119216latihan3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.a10119216latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }


    }

    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}

//tanggal : 27/4/2022
//Kelas   : IF-6
//Nama    : Muhammad Syarifuddin Rahiman
//NIM     : 10119216