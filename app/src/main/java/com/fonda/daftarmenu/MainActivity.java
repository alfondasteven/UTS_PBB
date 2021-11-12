package com.fonda.daftarmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.fonda.daftarmenu.DetailFood;
import com.fonda.daftarmenu.Food;
import com.fonda.daftarmenu.FoodData;
import com.fonda.daftarmenu.ListFoodAdapter;
import com.fonda.daftarmenu.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        rvFood.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFood.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food food) {
                //showSelectedFood(data);
                Intent moveIntent = new Intent(MainActivity.this, DetailFood.class);
                moveIntent.putExtra(DetailFood.ITEM_EXTRA,food);
                startActivity(moveIntent);
            }
        });
    }
   /* private void showSelectedFood(Food food){
        Toast.makeText(this,"Kamu memilih menu ini" + food.getNameFood(),Toast.LENGTH_SHORT).show();
    }*/
}