package com.example.ujianpraktek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CuacaAdapter extends ArrayAdapter<Cuaca> {

    public CuacaAdapter(Context context, ArrayList<Cuaca> cuaca){ super(context,0, cuaca); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Cuaca cuaca = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_list, parent, false);
        }

        ImageView imgCuaca = (ImageView) convertView.findViewById(R.id.cuaca);
        TextView txtWaktu = (TextView) convertView.findViewById(R.id.waktu);

        imgCuaca.setImageResource(cuaca.fotoId);
        txtWaktu.setText(cuaca.waktu);

        return convertView;
    }
}
