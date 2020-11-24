package com.example.android_17_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] list = getResources().getStringArray(R.array.list);
        ArrayAdapter<String> dynamic = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);
        ListView listView = (ListView)findViewById(R.id.listview1);
        listView.setAdapter(dynamic);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView set_text = (TextView)findViewById(R.id.tv1);
                set_text.setText("你選擇了: " + list[position]);
            }
        });
    }
}