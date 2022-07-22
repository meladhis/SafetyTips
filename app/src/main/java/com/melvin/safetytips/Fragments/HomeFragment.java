package com.melvin.safetytips.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import com.melvin.safetytips.R;

public class HomeFragment extends Fragment {
    private TextView temperature,cervicalMucus,none,sticky,creamy,eggWhite,watery,sex,none1,protect,
            notProtected,menstruation,light,medium,heavy,moods,symptoms;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView temperature = (TextView) view.findViewById(R.id.temp);
        TextView cervicalMucus = (TextView) view.findViewById(R.id.cerv);
        TextView none = (TextView) view.findViewById(R.id.none1);
        TextView sticky = (TextView) view.findViewById(R.id.sticky1);
        TextView creamy = (TextView) view.findViewById(R.id.creamy1);
        TextView eggWhite = (TextView) view.findViewById(R.id.egg1);
        TextView watery = (TextView) view.findViewById(R.id.watery1);
        TextView sex = (TextView) view.findViewById(R.id.sex);
        TextView  none1= (TextView) view.findViewById(R.id.none1);
        TextView protect = (TextView) view.findViewById(R.id.protect1);
        TextView notProtected = (TextView) view.findViewById(R.id.ic_not_protected1);
        TextView menstruation = (TextView) view.findViewById(R.id.mens);
        TextView light = (TextView) view.findViewById(R.id.light1);
        TextView medium = (TextView) view.findViewById(R.id.medium1);
        TextView heavy = (TextView) view.findViewById(R.id.heavy1);
        TextView moods = (TextView) view.findViewById(R.id.moods);
        TextView symptoms = (TextView) view.findViewById(R.id.symp);
        return view;
    }
}