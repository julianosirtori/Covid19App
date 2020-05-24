package dev.julianosirtori.covid.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.julianosirtori.covid.R;
import dev.julianosirtori.covid.data.Estado;

public class EstadosAdapter extends RecyclerView.Adapter<EstadosAdapter.EstadoViewHolder> {

    private ArrayList<Estado> estados;


    public EstadosAdapter(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    @NonNull
    @Override
    public EstadoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.estado_item, parent, false);
        return new EstadoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EstadoViewHolder holder, int position) {
        holder.txtEstado.setText(this.estados.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return estados.size();
    }

    static  class EstadoViewHolder extends RecyclerView.ViewHolder{

        TextView txtEstado;

        EstadoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtEstado = itemView.findViewById(R.id.txt_estado);
        }
    }
}
