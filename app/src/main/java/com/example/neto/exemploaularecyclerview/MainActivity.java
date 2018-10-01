package com.example.neto.exemploaularecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =  findViewById(R.id.recycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration did = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(did);

        ItemAdapter itemAdapter = new ItemAdapter(this);

        recyclerView.setAdapter(itemAdapter);

    }
}
