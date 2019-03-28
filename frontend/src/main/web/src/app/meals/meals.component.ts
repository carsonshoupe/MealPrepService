import { Component, OnInit, Output, EventEmitter } from '@angular/core';

import { Meal } from './Meal';
import { MealsService } from '../meals.service';
import { MenuComponent } from '../menu/menu.component';

@Component({
  providers: [MenuComponent],
  selector: 'app-meals',
  templateUrl: './meals.component.html',
  styleUrls: ['./meals.component.css']
})
export class MealsComponent implements OnInit {

  meals: any;
  showMealID: number;

  constructor(private mealsService: MealsService, private menuComponent: MenuComponent) { }

  @Output() mealsJSON = new EventEmitter();

  /**
   * Gets data from the mealsService
   * JSON of meals data
   * Subscribes it to our model
   */
  ngOnInit() {
    this.mealsService.getMockData().subscribe(mealsServiceObj => {
      this.meals = mealsServiceObj;
      this.menuComponent.mealsJSON = this.meals;
    });
  }

  /**
   * @param clickedItem The item which the user has clicked on
   * Checks the item that the user has selected
   * Passes that data into the menu component which then displays the data accordingly
   */
  onClickMeal(clickedItem) {
    console.log(clickedItem);
    this.menuComponent.displayMeals(clickedItem);
    this.showMealID = clickedItem.id;
    console.log(this.showMealID);
    console.log(clickedItem.id);
  }

  /**
   * Checks which meal was clicked
   */

}
