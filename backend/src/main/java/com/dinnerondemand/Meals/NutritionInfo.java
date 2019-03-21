package com.dinnerondemand.Meals;

public class NutritionInfo {
    private int calories;
    private int totalFat;
    private int cholesterol;
    private int sodium;
    private int carbs;
    private int dietaryFiber;
    private int sugar;
    private int protein;

    public NutritionInfo() {}

    public NutritionInfo(int calories, int totalFat, int cholesterol, int sodium, int carbs, int dietaryFiber, int sugar, int protein) {
        this.calories = calories;
        this.totalFat = totalFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbs = carbs;
        this.dietaryFiber = dietaryFiber;
        this.sugar = sugar;
        this.protein = protein;
    }

    public int getCalories() {return calories;}
    public void setCalories(int calories) {this.calories = calories;}
    public int getTotalFat() {return totalFat;}
    public void setTotalFat(int totalFat) {this.totalFat = totalFat;}
    public int getCholesterol() {return cholesterol;}
    public void setCholesterol(int cholesterol) {this.cholesterol = cholesterol;}
    public int getSodium() {return sodium;}
    public void setSodium(int sodium) {this.sodium = sodium;    }
    public int getCarbs() {return carbs;}
    public void setCarbs(int carbs) { this.carbs = carbs;}
    public int getDietaryFiber() {return dietaryFiber;}
    public void setDietaryFiber(int dietaryFiber) {this.dietaryFiber = dietaryFiber;}
    public int getSugar() {return sugar;}
    public void setSugar(int sugar) {this.sugar = sugar;}
    public int getProtein() {return protein;}
    public void setProtein(int protein) {this.protein = protein;}


}
