package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class mostrarGrafica extends AppCompatActivity {

    private LineChart lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_grafica2);
        lineChart=(LineChart)findViewById(R.id.lineChart);



        ArrayList<Entry> yValue= new ArrayList<>();
        yValue.add(new Entry(0,60f));
        yValue.add(new Entry(1,50f));
        yValue.add(new Entry(2,70f));
        yValue.add(new Entry(3,100f));
        yValue.add(new Entry(4,90f));
        yValue.add(new Entry(5,85f));
        yValue.add(new Entry(6,45f));
        LineDataSet set1= new LineDataSet(yValue,"Data set1");

        set1.setFillAlpha(110);
        set1.setColor(Color.RED);
        ArrayList<ILineDataSet> dataSets= new ArrayList<>();
        dataSets.add(set1);

        LineData data= new LineData(dataSets);
        lineChart.setData(data);



    }
}