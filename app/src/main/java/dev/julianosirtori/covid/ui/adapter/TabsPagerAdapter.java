package dev.julianosirtori.covid.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

import dev.julianosirtori.covid.ui.views.About.AboutFragment;
import dev.julianosirtori.covid.ui.views.Home.HomeFragment;
import dev.julianosirtori.covid.ui.views.Statistics.StatisticsFragment;
import dev.julianosirtori.covid.ui.views.Symptoms.SymptomsFragment;

public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragments;

    public TabsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new StatisticsFragment());
        fragments.add(new SymptomsFragment());
        fragments.add(new AboutFragment());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}
