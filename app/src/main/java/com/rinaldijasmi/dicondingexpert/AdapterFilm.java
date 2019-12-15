package com.rinaldijasmi.dicondingexpert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterFilm extends ArrayAdapter<ItemFilm> {
    public AdapterFilm(@NonNull Context context, @NonNull List<ItemFilm> itemfilm) {
        super(context, 0, itemfilm);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ItemFilm film = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_film, parent, false);
        }

        TextView tvJudul = convertView.findViewById(R.id.textJudul);
        TextView tvTanggal = convertView.findViewById(R.id.textTanggal);
        TextView tvDeskipsi = convertView.findViewById(R.id.textDesc);
        ImageView tvPoster = convertView.findViewById(R.id.imgFilm);

        tvJudul.setText(film.judulFilm);
        tvTanggal.setText(film.tanggalFilm);
        tvDeskipsi.setText(film.descFilm + "...");
        tvPoster.setImageResource(film.posterFilm);

        return convertView;
    }
}