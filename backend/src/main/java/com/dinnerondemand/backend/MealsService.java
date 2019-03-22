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

    private List<Meal> meals = Meals.getAllMeals();



    public List<Meal> getAllMeals() {
        return this.meals;
    }

    public Meal getMeal(int id) {
        return Meals.getMeal(id);
    }


}
