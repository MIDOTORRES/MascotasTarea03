package com.miditos.mascotastarea03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_favoritos);

        recyclerView = (RecyclerView) findViewById(R.id.rv);



        mascotas.add(new Mascota(R.drawable.mascota1,"Mascota 1"));
        mascotas.add(new Mascota(R.drawable.mascota3,"Mascota 3"));
        mascotas.add(new Mascota(R.drawable.mascota5,"Mascota 5"));
        mascotas.add(new Mascota(R.drawable.mascota8,"Mascota 8"));
        mascotas.add(new Mascota(R.drawable.mascota9,"Mascota 9"));


        // Obtener el Recycler
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Crear un nuevo adaptador
        adapter = new RecyclerAdapter(mascotas);
        recyclerView.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}