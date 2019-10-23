package com.themavencoder.spaceam.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.themavencoder.spaceam.R;
import com.themavencoder.spaceam.fragments.food.FoodAdapter;
import com.themavencoder.spaceam.fragments.food.FoodData;
import com.themavencoder.spaceam.fragments.food.SampleFood;
import com.themavencoder.spaceam.fragments.trend.SampleData;
import com.themavencoder.spaceam.fragments.trend.TrendAdapter;
import com.themavencoder.spaceam.fragments.trend.TrendData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewTrend, recyclerViewFood;
    private List<TrendData> modelList = SampleData.TREND;
    private List<FoodData> modelListFood = SampleFood.TREND;
    private TrendAdapter adapterTrend;
    private FoodAdapter adapterFood;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_home, container, false);
        init(v);
        getTrending();
        getFood();


        return v;
    }

    private void getFood() {
        adapterFood = new FoodAdapter(modelListFood);
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewFood.setAdapter(adapterFood);

    }
    private void getTrending() {
        adapterTrend = new TrendAdapter(modelList);
        recyclerViewTrend.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewTrend.setAdapter(adapterTrend);
    }

    private void init(View v) {
recyclerViewTrend =v.findViewById(R.id.recycler_view_trending);
adapterTrend =new TrendAdapter(modelList);
recyclerViewFood = v.findViewById(R.id.recycler_view_food);
adapterFood = new FoodAdapter(modelListFood);


    }

}
