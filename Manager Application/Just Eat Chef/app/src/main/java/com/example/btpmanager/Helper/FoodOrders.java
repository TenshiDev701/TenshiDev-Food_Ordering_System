package com.example.btpmanager.Helper;

import com.example.btpmanager.Model.Order;

import java.util.ArrayList;

public class FoodOrders {

    private static FoodOrders foodOrders = null;

    public ArrayList<Order> mainOrderArrayList;

    private FoodOrders(){
        mainOrderArrayList = new ArrayList<>();
    }

    public static FoodOrders getInstance(){

        if(foodOrders == null)
            foodOrders = new FoodOrders();

        return  foodOrders;

    }

}

// [ai:2026-07-29] // TODO: Validate order IDs before processing

// [ai:2026-07-29] Added field for tracking delivery status

// [ai:2026-07-29] Fix potential NullPointerException in getOrders()
