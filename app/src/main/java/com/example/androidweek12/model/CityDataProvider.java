package com.example.androidweek12.model;
import com.example.androidweek12.R;
import java.util.ArrayList;

public class CityDataProvider {
    private ArrayList<City> cities;

    public CityDataProvider(){
        cities.add(new City("Bangkok", R.drawable.bangkok, 10_000_000));
        cities.add(new City("Beijing", R.drawable.beijing, 21_500_000));
        cities.add(new City("London", R.drawable.london, 8_900_000));
        cities.add(new City("New York", R.drawable.newyork, 8_400_000));
        cities.add(new City("Paris", R.drawable.paris, 2_100_000));
        cities.add(new City("Rio de Janeiro", R.drawable.rio, 6_700_000));
        cities.add(new City("Rome", R.drawable.rome, 2_800_000));
        cities.add(new City("Singapore", R.drawable.singapore, 5_700_000));
        cities.add(new City("Sydney", R.drawable.sydney, 5_300_000));
        cities.add(new City("Tokyo", R.drawable.tokyo, 13_900_000));
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}
