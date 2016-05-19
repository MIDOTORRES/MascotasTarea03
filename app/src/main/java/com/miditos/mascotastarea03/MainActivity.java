package com.miditos.mascotastarea03;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Mascota> mascotas = new ArrayList<Mascota>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);



        mascotas.add(new Mascota(R.drawable.mascota1,"Mascota 1"));
        mascotas.add(new Mascota(R.drawable.mascota2,"Mascota 2"));
        mascotas.add(new Mascota(R.drawable.mascota3,"Mascota 3"));
        mascotas.add(new Mascota(R.drawable.mascota4,"Mascota 4"));
        mascotas.add(new Mascota(R.drawable.mascota5,"Mascota 5"));
        mascotas.add(new Mascota(R.drawable.mascota6,"Mascota 6"));
        mascotas.add(new Mascota(R.drawable.mascota7,"Mascota 7"));
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
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // Toast.makeText(this,"Este es el item: "+item.getTitle(),Toast.LENGTH_SHORT).show();

            return true;
        }
        if (id == R.id.action_favoritos) {
            // Toast.makeText(this,"Este es el item: "+item.getTitle(),Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this , Favoritos.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
