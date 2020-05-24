package dev.julianosirtori.covid.ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

import dev.julianosirtori.covid.R;
import dev.julianosirtori.covid.data.Estado;
import dev.julianosirtori.covid.ui.adapter.EstadosAdapter;

public class EstadosDialogFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.estados_dialog_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.list_estados);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<Estado> estados = new ArrayList<>();
        estados.add(new Estado("Paraná"));
        estados.add(new Estado("Rio Grande Do Sul"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("São Paulo"));
        EstadosAdapter estadosAdapter = new EstadosAdapter(estados);

        recyclerView.setAdapter(estadosAdapter);
        return view;
    }
}
