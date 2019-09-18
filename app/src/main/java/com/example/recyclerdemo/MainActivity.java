package com.example.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        List<ModenClass>modenClassList=new ArrayList<>();
        modenClassList.add(new ModenClass(R.drawable.download,"one","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"two","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"there","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"four","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"five","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"six","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"seven","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"eight","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"nine","hello"));
        modenClassList.add(new ModenClass(R.drawable.download,"ten","hello"));
        Adapter adapter=new Adapter(modenClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
