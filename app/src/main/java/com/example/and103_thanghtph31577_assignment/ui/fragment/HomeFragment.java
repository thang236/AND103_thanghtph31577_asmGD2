package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and103_thanghtph31577_assignment.DummyData;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.adapters.FabAdapter;
import com.example.and103_thanghtph31577_assignment.adapters.MostAdapter;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentHomeBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;
import com.example.and103_thanghtph31577_assignment.retrofit.RetrofitBuilder;
import com.example.and103_thanghtph31577_assignment.retrofit.RetrofitProduct;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
 private FabAdapter fabAdapter;
    private MostAdapter mostAdapter;
    private List<Product> productList;
    private Context context;
    private RetrofitProduct retrofitProduct;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        context = requireActivity();
        fetchProduct();

//        configAdapter();
        return binding.getRoot();
    }

    private void fetchProduct() {
        retrofitProduct =  RetrofitBuilder.getRetrofitInstance().create(RetrofitProduct.class);

        Call<JsonObject> call = retrofitProduct.getAllProduct();

        call.enqueue(new Callback<JsonObject>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                productList.clear();
                JsonObject res = response.body();
                Log.d("TAG123123", "onResponse: " + res.toString());
                if (res != null && res.has("data")) {
                    JsonArray dataArray = res.getAsJsonArray("data");
                    Gson gson = new Gson();
                    for (int i = 0; i < dataArray.size(); i++) {
                        JsonObject carObject = dataArray.get(i).getAsJsonObject();
                        Product product = gson.fromJson(carObject, Product.class);
                        productList.add(product);
                    }
                    Log.d("zzzzzz", "onResponse: "+productList.size());

                    mostAdapter = new MostAdapter(productList, context);
                    binding.rcvItem.setAdapter(mostAdapter);

                    mostAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });

    }
    private void configAdapter() {
        productList = DummyData.generateDummyData();
        mostAdapter = new MostAdapter(productList, context);
        binding.rcvItem.setAdapter(mostAdapter);
        fabAdapter = new FabAdapter(productList, context);
        binding.rcvItemFab.setAdapter(fabAdapter);


    }
}