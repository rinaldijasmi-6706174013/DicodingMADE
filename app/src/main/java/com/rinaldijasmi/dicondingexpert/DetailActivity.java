package com.rinaldijasmi.dicondingexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView judulFilm, tanggalFilm, deskripsiFilm;
    ImageView posterFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judulFilm = findViewById(R.id.textJudulFilm);
        tanggalFilm = findViewById(R.id.textTanggalFilm);
        deskripsiFilm = findViewById(R.id.textDescFilm);
        posterFilm = findViewById(R.id.imgPoster);

        ItemFilm item = getIntent().getParcelableExtra("Film");
        String mJudulFilm = item.getJudulFilm();
        String mTanggalFilm = item.getTanggalFilm();
        String mDeskripsiFilm = item.getDescFilm();
        int mPosterFilm = item.getPosterFilm();

        judulFilm.setText(mJudulFilm);
        tanggalFilm.setText(mTanggalFilm);
        deskripsiFilm.setText(mDeskripsiFilm);
        posterFilm.setImageResource(mPosterFilm);



    }
}
