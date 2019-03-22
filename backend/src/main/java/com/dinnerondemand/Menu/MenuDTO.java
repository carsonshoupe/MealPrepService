package com.dinnerondemand.Menu;

import com.dinnerondemand.Meals.Meal;

import java.util.ArrayList;
import java.util.List;

public class MenuDTO {
    private String month;
    private List<Meal> meals = new ArrayList<Meal>();

    public MenuDTO() {}

    public MenuDTO(String month, ArrayList<Meal> meals) {
        this.month = month;
        this.meals = meals;
    }

    public String getMonth() {return month;}
    public void setMonth(String month) {this.month = month;}
    public List<Meal> getMeals() {return meals;}
    public void setMeals(ArrayList<Meal> mealIds) {this.meals = mealIds;}

    public void addMeal(Meal meal) {meals.add(meal);}
}
