package com.kelompok9.versiandroid;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Andro> androList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androList = new ArrayList<>();

        //getting string arrays from resource
        Resources res = getResources();
        String[] allAndros = res.getStringArray(R.array.andros);
        String[] allDates = res.getStringArray(R.array.dates);

        pupoluateAndroList(allAndros, allDates);

        //setting adapter and listview
        AndroAdapter adapter = new AndroAdapter(getApplicationContext(),
                R.layout.list_item, androList);
        ListView listview = findViewById(R.id.andro_list);
        listview.setAdapter(adapter);

    }
    public void pupoluateAndroList(String[] andros, String[] dates) {
        androList.add(new Andro(andros[0], dates[0], R.drawable.satu));
        androList.add(new Andro(andros[1], dates[1], R.drawable.dua));
        androList.add(new Andro(andros[2], dates[2], R.drawable.tiga));
        androList.add(new Andro(andros[3], dates[3], R.drawable.empat));
        androList.add(new Andro(andros[4], dates[4], R.drawable.lima));
        androList.add(new Andro(andros[5], dates[5], R.drawable.enam));
        androList.add(new Andro(andros[6], dates[6], R.drawable.tujuh));
        androList.add(new Andro(andros[7], dates[7], R.drawable.delapan));
        androList.add(new Andro(andros[8], dates[8], R.drawable.sembilan));
        androList.add(new Andro(andros[9], dates[9], R.drawable.sepuluh));
        androList.add(new Andro(andros[10], dates[10], R.drawable.sebelas));
        androList.add(new Andro(andros[11], dates[11], R.drawable.duabelas));

    }

}
