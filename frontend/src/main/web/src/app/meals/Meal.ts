export class Meal {
  id: number;
  name: string;
  protein: string;
  description: string;
  cookTime: string;
  cookType: string;
  recommendedSides: string[];
  nutritionInfo: {
    calories: number;
    totalFat: number;
    cholesterol: number;
    sodium: number;
    carbs: number;
    dietaryFiber: number;
    sugar: number;
    protein: number
  };
  glutenFree: boolean;
  vegetarian: boolean;
  vegan: boolean;

  constructor(name: string) {
    this.name = name;
  }

  toString() {
    return this.name + " " + this.description;
  }
}
