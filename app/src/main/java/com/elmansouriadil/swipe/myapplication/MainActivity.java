package com.elmansouriadil.swipe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EtudiantAdapter etudiantAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.liste);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        etudiantAdapter = new EtudiantAdapter(this);
        recyclerView.setAdapter(etudiantAdapter);
        //don't forget that etudiant adapter implements getAdapterData
        SimpleClique s = new SimpleClique(etudiantAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(s);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }



}
