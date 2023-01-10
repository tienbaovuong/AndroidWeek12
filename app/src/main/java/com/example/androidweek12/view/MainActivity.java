package com.example.androidweek12.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Observer;

import android.os.Bundle;

import com.example.androidweek12.R;
import com.example.androidweek12.databinding.ActivityMainBinding;
import com.example.androidweek12.model.City;
import com.example.androidweek12.viewModel.CityViewModel;

public class MainActivity extends AppCompatActivity {

    CityViewModel model = new CityViewModel();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onResume() {
        super.onResume();
        model.getCityData().observe(this, city -> {
            binding.cityImage.setImageDrawable(
                    ResourcesCompat.getDrawable(getResources(), city.img, getApplicationContext().getTheme())
            );
            binding.cityNameTV.setText(city.name);
            binding.cityPopulationTV.setText(String.valueOf(city.population));
        });
    }
}