/*
 * *
 * Creator: Tobiloba Adejumo on 3/6/19 11:32 AM Last modified: 3/6/19 11:32 AM Copyright: All rights reserved Ⓒ 2019
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language governing
 *    permissions and limitations under the License.
 * /
 */

package com.themavencoder.spaceam.fragments.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.themavencoder.spaceam.R;


import java.util.List;

/**
 * Created by themavencoder on 06,March,2019
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    private List<FoodData> modelList;
    private Context context;
    private FoodOnClickListener mListener;

    public FoodAdapter(List<FoodData> modelList) {

        this.modelList = modelList;

    }

    public void setFoodListener(FoodOnClickListener mListener) {
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_food,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        FoodData model = modelList.get(i);
        myViewHolder.bind(mListener, model);

    }

    @Override
    public int getItemCount() {
        return null != modelList ? modelList.size() : 0;
    }

     class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewprice;
        private TextView textViewHeaderOne, textViewHeaderTwo;
        private ImageView imageviewFood;
         MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewprice = itemView.findViewById(R.id.textview_price);
            textViewHeaderOne = itemView.findViewById(R.id.textview_header_one);
            textViewHeaderTwo = itemView.findViewById(R.id.textview_header_two);
            imageviewFood  = itemView.findViewById(R.id.imageview_food);

        }

        void bind(final FoodOnClickListener mListener, final FoodData model) {
             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     mListener.onClick(model);
                 }
             });

             textViewHeaderOne.setText(model.getName());

            Glide.with(itemView.getContext())
                    .load(model.getImage())
                    .apply(new RequestOptions()
                            .placeholder(R.color.colorAccent)
                            .error(R.color.black))
                    .into(imageviewFood);
        }
    }
}
