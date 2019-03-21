package com.dinnerondemand.Meals;

import java.util.ArrayList;

public class Meal {
    private String id;
    private String name;
    private String protein;
    private String description;
    private int cookTime;
    private String cookType;
    private ArrayList<String> recommendedSides;
    private NutritionInfo nutritionInfo;
    private boolean glutenFree;
    private boolean vegetarian;
    private boolean vegan;

    public Meal() {}

    public Meal(String id, String name, String protein, String description, int cookTime, String cookType, ArrayList<String> recommendedSides, NutritionInfo nutritionInfo, boolean glutenFree, boolean vegetarian, boolean vegan) {
        this.id = id;
        this.name = name;
        this.protein = protein;
        this.description = description;
        this.cookTime = cookTime;
        this.cookType = cookType;
        this.recommendedSides = recommendedSides;
        this.nutritionInfo = nutritionInfo;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getProtein() {return protein;}
    public void setProtein(String protein) {this.protein = protein;}
    public ArrayList<String> getRecommendedSides() {return recommendedSides;}
    public void setRecommendedSides(ArrayList<String> recommendedSides) {this.recommendedSides = recommendedSides;}
    public int getCookTime() {return cookTime;}
    public void setCookTime(int cookTime) {this.cookTime = cookTime;}
    public String getCookType() {return cookType;}
    public void setCookType(String cookType) {this.cookType = cookType;}
    public NutritionInfo getNutritionInfo() {return nutritionInfo;}
    public void setNutritionInfo(NutritionInfo nutritionInfo) {this.nutritionInfo = nutritionInfo;}
    public boolean isGlutenFree() {return glutenFree;}
    public void setGlutenFree(boolean glutenFree) {this.glutenFree = glutenFree;}
    public boolean isVegetarian() {return vegetarian;}
    public void setVegetarian(boolean vegetarian) {this.vegetarian = vegetarian;}
    public boolean isVegan() {return vegan;}
    public void setVegan(boolean vegan) {this.vegan = vegan;}



}
