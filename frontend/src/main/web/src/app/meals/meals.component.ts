import { Component, OnInit } from '@angular/core';

import { Meal } from './Meal';
import { MealsService } from '../meals.service';

@Component({
  selector: 'app-meals',
  templateUrl: './meals.component.html',
  styleUrls: ['./meals.component.css']
})
export class MealsComponent implements OnInit {

  meals: Meal[];

  constructor(private mealsService: MealsService) { }

  ngOnInit() {
    this.getMeals();
  }

  getMeals(): void {
    this.mealsService.getMeals()
      .subscribe(meals => {
        this.meals = meals;
        console.log("meals: " + this.meals[1].protein);
      });
    }
}
