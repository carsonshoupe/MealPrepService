package com.dinnerondemand.backend;

import com.dinnerondemand.Meals.Meal;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Meals {
    private static HashMap<Integer, Meal> mealsMap = new HashMap<Integer, Meal>();
    private static List<Meal> meals;

    static {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("src/main/resources/Meals.json");
            meals = objectMapper.readValue(file, new TypeReference<List<Meal>>(){});
            for (Meal meal : meals) mealsMap.put(Integer.valueOf(meal.getId()), meal);
        } catch (IOException e) {
            System.out.println("Failed to load meals");
            e.printStackTrace();
        }
    }

    public static List<Meal> getAllMeals() {return meals;}


    public static Meal getMeal(Integer id) {
        return mealsMap.get(id);
    }

}
