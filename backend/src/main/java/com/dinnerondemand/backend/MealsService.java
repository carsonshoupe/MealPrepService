package com.dinnerondemand.backend;

import com.dinnerondemand.Meals.Meal;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MealsService {
    private static List<Meal> loadedMeals;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/Meals.json");
            loadedMeals = objectMapper.readValue(file, new TypeReference<List<Meal>>(){});
        } catch (IOException e) {
            System.out.println("Failed to load meals");
            e.printStackTrace();
        }
    }

    private List<Meal> meals = MealsService.loadedMeals;

    public List<Meal> getAllMeals() {
        return this.meals;
    }


}
