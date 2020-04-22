package com.example.ujianpraktek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Cuaca> arrayCuaca = new ArrayList<>();
        CuacaAdapter adapter = new CuacaAdapter(this, arrayCuaca);
        ListView listView = (ListView) findViewById(R.id.listcuaca);
        listView.setAdapter(adapter);

        Cuaca cuaca;

        cuaca = new Cuaca(R.drawable.berawan, "12:00");
        adapter.add(cuaca);

        cuaca = new Cuaca(R.drawable.berawan, "13:00");
        adapter.add(cuaca);

        cuaca = new Cuaca(R.drawable.berawan, "14:00");
        adapter.add(cuaca);

        cuaca = new Cuaca(R.drawable.berawan, "15:00");
        adapter.add(cuaca);
    }
}
