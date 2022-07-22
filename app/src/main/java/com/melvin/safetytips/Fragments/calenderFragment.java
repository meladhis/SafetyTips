package com.melvin.safetytips.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import com.melvin.safetytips.R;


public class calenderFragment extends Fragment {

    //private  static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;
    //private Date date;
    private Button next;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calender, container, false);


        Button next = (Button) view.findViewById(R.id.nxt);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        CalendarView mCalendarView = (CalendarView) view.findViewById(R.id.calender_view);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/" + dayOfMonth;
                //Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                //Intent intent = new Intent(DayActivity.this,MainActivity.class);
                //intent.putExtra("date",date);
                //startAct  ivity(intent);

            }

        });

        return view;
    }
}