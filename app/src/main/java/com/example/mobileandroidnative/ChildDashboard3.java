package com.example.mobileandroidnative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class ChildDashboard3 extends AppCompatActivity {

    BarChart barChart;
    RecyclerView recyclerView;
    LinearLayout linearRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_dashboard3);

        barChart = findViewById(R.id.barchart);
        linearRecycle = findViewById(R.id.linear_recycle);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(13f, 0));
        entries.add(new BarEntry(14f, 1));
        entries.add(new BarEntry(16f, 2));
        entries.add(new BarEntry(17f, 3));
        entries.add(new BarEntry(15f, 4));
        entries.add(new BarEntry(16f, 5));

        BarDataSet bardataset = new BarDataSet(entries, "");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("16");
        labels.add("15");
        labels.add("14");
        labels.add("13");
        labels.add("12");
        labels.add("11");

        BarData data = new BarData(labels, bardataset);

        barChart.setData(data); // set the data and list of labels into chart
        bardataset.setColor(Color.parseColor("#3F63A9"));



        MyListData2[] myListData = new MyListData2[] {
                new MyListData2("Rebecca Morgan", "12:34 PM", "Mama always said life was like a box of chocolates. You never know what…", R.drawable.profile_friend1),
                new MyListData2("Justin Holmes", "12:34 PM", "Mama always said life was like a box of chocolates. You never know what…", R.drawable.profile_friend2),

        };

    }
}
