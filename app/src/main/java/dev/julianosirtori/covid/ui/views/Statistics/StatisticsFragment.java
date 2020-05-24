package dev.julianosirtori.covid.ui.views.Statistics;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import dev.julianosirtori.covid.R;
import dev.julianosirtori.covid.ui.dialog.EstadosDialogFragment;

public class StatisticsFragment extends Fragment {

    private StatisticsViewModel mViewModel;

    public static StatisticsFragment newInstance() {
        return new StatisticsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.statistics_fragment, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.btn_estados);
        linearLayout.setOnClickListener(view1 -> {
            EstadosDialogFragment estadosDialogFragment = new EstadosDialogFragment();
            estadosDialogFragment.show(getParentFragmentManager(), "dialog_estados");
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StatisticsViewModel.class);
        // TODO: Use the ViewModel
    }

}
