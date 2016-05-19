package com.miditos.mascotastarea03;

/**
 * Created by MIDITOS on 19/05/16.
 */import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by MIDITOS on 15/05/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    private ArrayList<Mascota> arrayList = new ArrayList<Mascota>();



    public RecyclerAdapter(ArrayList<Mascota> arrayList){
        this.arrayList = arrayList;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        final Mascota mascota = arrayList.get(position);
        holder.mascota_nombre.setText(mascota.getNombre());
        holder.mascota_foto.setImageResource(mascota.getFoto());
        holder.btnLike.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(v.getContext(),"Diste Like a " + mascota.getNombre(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView mascota_foto;
        TextView mascota_nombre;
        ImageButton btnLike;

        public RecyclerViewHolder (View view){
            super(view);
            mascota_foto = (ImageView) itemView.findViewById(R.id.mascota_foto);
            mascota_nombre = (TextView) itemView.findViewById(R.id.mascota_nombre);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
        }

    }


}

