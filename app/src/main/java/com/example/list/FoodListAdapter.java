package com.example.list;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.list.Food;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {

    private List<Food> foodList;
    private Context context;

    public FoodListAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView title, desc, price;

        public ViewHolder(View view) {
            super(view);

            photo =view.findViewById(R.id.photo);
            title =view.findViewById(R.id.title);
            desc =view.findViewById(R.id.desc);
            price =view.findViewById(R.id.price);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {
        Food item = foodList.get(position);

        viewHolder.photo.setImageResource(item.getPhoto());
        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText(item.getDesc());
        viewHolder.price.setText(""+item.getPrice());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}