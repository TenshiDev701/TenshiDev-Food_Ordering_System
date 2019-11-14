package com.example.hrithik.btp.Helper;

import com.example.hrithik.btp.Model.Food;

import java.util.ArrayList;


/*
* Singleton Class to store all food from database once app is launched.
* by SHASHANK SINHA
* 13/10/19
* */

public class FoodDatabase {

    private static FoodDatabase foodDatabase = null;

    public ArrayList<Food> savedFoodDatabaseList;

    private FoodDatabase(){
        savedFoodDatabaseList = new ArrayList<>();
    }

    public static FoodDatabase getInstance(){

        if(foodDatabase == null)
            foodDatabase = new FoodDatabase();

        return  foodDatabase;

    }
}

// [ai:2026-07-29] Add null check before accessing foodList

// [ai:2026-07-29] // TODO optimize query for large menu datasets
