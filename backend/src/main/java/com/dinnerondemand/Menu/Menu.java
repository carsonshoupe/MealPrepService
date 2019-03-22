package com.dinnerondemand.Menu;

import com.dinnerondemand.Meals.Meal;
import com.dinnerondemand.backend.Meals;

import java.util.ArrayList;

public class Menu {
    private String month;
    private ArrayList<Integer> mealIds;

    public Menu() {}

    public Menu(String month, ArrayList<Integer> mealIds) {
        this.month = month;
        this.mealIds = mealIds;
    }

    public String getMonth() {return month;}
    public ArrayList<Integer> getMealIds() {return mealIds;}

    public MenuDTO toMenuDTO() {
        MenuDTO outputMenuDTO = new MenuDTO();
        outputMenuDTO.setMonth(this.getMonth());
        for (Integer id : this.getMealIds()) {
            outputMenuDTO.addMeal(Meals.getMeal(id));
        }
        return outputMenuDTO;

    }


}
