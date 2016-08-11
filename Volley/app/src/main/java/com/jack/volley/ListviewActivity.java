package com.jack.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {
private String[] data = {"Apple","Banana","Orange","Watermelon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ArrayAdapter <String> adapter= new ArrayAdapter<String>(
                ListviewActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
