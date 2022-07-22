package com.melvin.safetytips.Fragments;

import static android.graphics.Color.RED;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
//import com.jjoe64.graphview.GraphView;
//mport com.jjoe64.graphview.series.DataPoint;
//imiport com.jjoe64.graphview.series.LineGraphSeries;
import com.melvin.safetytips.R;

import org.w3c.dom.Entity;

import java.util.ArrayList;
import java.util.Map;

public class GraphFragment extends Fragment  {


    private static final String TAG = "GraphFragment";
    private LineChart graph,chart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graph, container, false);
        LineChart graph = (LineChart) view.findViewById(R.id.line_chart);
        LineChart chart = (LineChart) view.findViewById(R.id.line_chart1);

        //graph.setOnChartGestureListener(GraphFragment.this);
        //graph.setOnChartValueSelectedListener(GraphFragment.this);

        graph.setDragEnabled(true);
        graph.setScaleEnabled(true);

        ArrayList<Entry> yValues = new ArrayList<>();

        yValues.add(new Entry(0,80f));
        yValues.add(new Entry(1,70f));
        yValues.add(new Entry(2,60f));
        yValues.add(new Entry(3,50f));
        yValues.add(new Entry(4,40f));
        yValues.add(new Entry(5,30f));
        yValues.add(new Entry(6,20f));
        yValues.add(new Entry(7,10f));
        yValues.add(new Entry(8,0f));
        LineDataSet lineDataSet = new LineDataSet(yValues,"Data lineDataSet");
        lineDataSet.setFillAlpha(110);

        ArrayList<ILineDataSet> mSet = new ArrayList<>();
        mSet.add(lineDataSet);
        //mSet.set(RED);
       // mSet.setLineWidth(3.0E00f);
        //mSet.setValueTextSize(10f);


        LineData data = new LineData(mSet);
        graph.setData(data);

        //chart.setOnChartGestureListener(GraphFragment.this);
       // chart.setOnChartValueSelectedListener(GraphFragment.this);

        chart.setDragEnabled(true);
        chart.setScaleEnabled(true);

        ArrayList<Entry> y_Values = new ArrayList<>();

        y_Values.add(new Entry(0,80f));
        y_Values.add(new Entry(1,70f));
        y_Values.add(new Entry(2,60f));
        y_Values.add(new Entry(3,50f));
        y_Values.add(new Entry(4,40f));
        y_Values.add(new Entry(5,30f));
        y_Values.add(new Entry(6,20f));
        y_Values.add(new Entry(7,10f));
        y_Values.add(new Entry(8,0f));
        LineDataSet mLineDataSet = new LineDataSet(y_Values,"Data lineDataSet");
        mLineDataSet.setFillAlpha(111);

        ArrayList<ILineDataSet> set = new ArrayList<>();
        set.add(mLineDataSet);

        LineData data1 = new LineData(set);
        chart.setData(data1);

        return view;
    }

}