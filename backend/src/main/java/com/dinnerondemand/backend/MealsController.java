package com.dinnerondemand.backend;

import com.dinnerondemand.Meals.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealsController {

    @Autowired
    private MealsService mealsService;

    @RequestMapping("/meals")
    public List<Meal> getAllMeals() {
        return mealsService.getAllMeals();
    }




}
