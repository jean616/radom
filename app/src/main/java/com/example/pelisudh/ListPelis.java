package com.example.pelisudh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListPelis extends RecyclerView.Adapter {
    private List<Pelicula> mispeliculas;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListPelis(List<Pelicula> mispeliculas, LayoutInflater layoutInflater, Context context) {
        this.mispeliculas = mispeliculas;
        this.layoutInflater = layoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.juntarrr(mispeliculas.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class Viewholder extends RecyclerView.ViewHolder{
        TextView titulo,anio,descipcion;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titulo =itemView.findViewById(R.id.rc_titulo);
            anio =itemView.findViewById(R.id.rc_anio);
            descipcion=itemView.findViewById(R.id.rc_descripcion);
        }
        public void juntarrr(Pelicula item){
            titulo.setText(item.getTitulo());
            anio.setText(item.getAnio());
            descipcion.setText(item.getDescripcion());
        }
    }
}
