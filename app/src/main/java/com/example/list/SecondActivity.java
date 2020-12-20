package com.example.list;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodListAdapter foodListAdapter;
    ArrayList<Food> foodList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Button btnChange;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        btnChange = findViewById(R.id.btnChange);
        foodList = new ArrayList<>();
        foodListAdapter = new FoodListAdapter(foodList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(foodListAdapter);

        foodList.add(new Food(R.drawable.cake, "Frutty cake", "Cake", 500));
        foodList.add(new Food(R.drawable.cake, "Frutty cake 2", "Cake", 1500));
        foodList.add(new Food(R.drawable.cake, "Frutty cake 3", "Cake", 2500));

        btnChange.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                layoutType =! layoutType;
                if (layoutType){
                    recyclerView.setLayoutManager(gridLayoutManager);
                    foodList.remove(0);
                }else{
                    recyclerView.setLayoutManager(linearLayoutManager);
                }


                foodListAdapter.notifyDataSetChanged();
            }
        });
    }
}
