package com.example.st.genesys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        LineChart chart = findViewById(R.id.line_chart);

        int quantity = getIntent().getIntExtra("totalQuantity", 0);
        int price = getIntent().getIntExtra("totalPrice",0);
        int hours = getIntent().getIntExtra("totalHours",0);

        Log.e("DATA", String.format("Quantity %d, Price %d, Hours %d", quantity,price,hours));
        List<Entry> entries = new ArrayList<>();

        entries.add(new Entry(0, 0));
        entries.add(new Entry(hours, price));

        LineDataSet lineDataSet = new LineDataSet(entries, "Price vs Time");
        LineData data = new LineData(lineDataSet);

        chart.setData(data);
        chart.invalidate();

    }
}
