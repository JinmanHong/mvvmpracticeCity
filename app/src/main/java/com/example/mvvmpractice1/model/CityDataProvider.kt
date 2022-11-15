package com.example.mvvmpractice1.model

import com.example.mvvmpractice1.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 10_000_000))
        cities.add(City("Bejing", R.drawable.beijing, 21_500_000))
        cities.add(City("London", R.drawable.london, 8_900_000))
        cities.add(City("New York", R.drawable.newyork, 8_400_000))
        cities.add(City("Paris", R.drawable.paris, 2_100_000))
        cities.add(City("Rio de janeiro", R.drawable.rio, 6_700_000))
        cities.add(City("Rome", R.drawable.rome,2_800_000))
        cities.add(City("Singapore", R.drawable.singapore,5_700_000 ))
        cities.add(City("Sydney", R.drawable.sydney,5_300_000))
        cities.add(City("Tokyo", R.drawable.tokyo,13_900_000))
        cities.add(City("Seoul", R.drawable.seoul,9_700_000))
        cities.add(City("Warsaw", R.drawable.warsaw,1_700_000))
    }

    fun getCities() = cities
}