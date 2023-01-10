package com.example.androidweek12.viewModel;

import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidweek12.model.City;
import com.example.androidweek12.model.CityDataProvider;

import java.util.ArrayList;

public class CityViewModel extends ViewModel {
    final Handler handler = new Handler(Looper.getMainLooper());
    MutableLiveData<City> cityData = new MutableLiveData<>();
    ArrayList<City> cities = new CityDataProvider().getCities();
    int currentIndex = 0;
    long delay = 4000L;

    public CityViewModel(){
        cityData.setValue(cities.get(0));
        this.loop();
    }

    public LiveData<City> getCityData() {
        return (LiveData<City>)cityData;
    }

    private void loop(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                updateCity();
            }
        }, delay);
    }

    private void updateCity(){
        currentIndex++;
        currentIndex %= cities.size();
        cityData.setValue(cities.get(currentIndex));
        loop();
    }
}
