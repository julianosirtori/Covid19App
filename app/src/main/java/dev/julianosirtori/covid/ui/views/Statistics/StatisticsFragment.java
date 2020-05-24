package dev.julianosirtori.covid.ui.views.Statistics;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;

import com.aiqfome.aiqchart.animation.Animation;
import com.aiqfome.aiqchart.model.BarSet;

import java.text.DecimalFormat;

import dev.julianosirtori.covid.R;
import dev.julianosirtori.covid.databinding.StatisticsFragmentBinding;
import dev.julianosirtori.covid.ui.dialog.EstadosDialogFragment;

public class StatisticsFragment extends Fragment {

    private StatisticsViewModel mViewModel;
    private StatisticsFragmentBinding binding;

    public static StatisticsFragment newInstance() {
        return new StatisticsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.statistics_fragment, container, false);
        binding.setLifecycleOwner(this);

        loadUI();



        return binding.getRoot();
    }

    private void loadUI() {

        binding.btnEstados.setOnClickListener(view1 -> {
            EstadosDialogFragment estadosDialogFragment = new EstadosDialogFragment();
            estadosDialogFragment.show(getParentFragmentManager(), "dialog_estados");
        });

        loadChartNewCases();

    }

    private void loadChartNewCases() {
        final String[] mLabels = {"01/04", "02/04", "03/04", "04/04", "05/04", "06/04", "07/04", "08/04"};
        final float[] mValues = {6.5f, 8.5f, 2.5f, 10f, 5f, 6f, 7f, 8f};

        BarSet barSet = new BarSet(mLabels, mValues);
        barSet.setColor(this.getResources().getColor(R.color.colorRed));

        binding.barChartNewCases.reset();
        binding.barChartNewCases.addData(barSet);

        binding.barChartNewCases.setLabelsFormat(new DecimalFormat("#"));

        Animation anim = new Animation(750);
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        binding.barChartNewCases.show(anim);

        binding.executePendingBindings();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StatisticsViewModel.class);
    }

}
