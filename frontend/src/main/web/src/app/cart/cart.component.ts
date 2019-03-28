import { Component, OnInit } from '@angular/core';

import { PricingComponent } from '../pricing/pricing.component'
import {Meal} from "../meals/Meal";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
  providers: [PricingComponent]
})
export class CartComponent implements OnInit {

  numOfMeals: number;
  portionSize: string;
  selectedMeals: Meal[] = [new Meal("test1"), new Meal("test2")];

  constructor( private pricingComponent: PricingComponent ) { }

  ngOnInit() { }

  getNumOfMeals($event) {
    this.numOfMeals = $event;
  }

  getPortionSize($event) {
    this.portionSize = $event;
  }

  addMeal($event) {
    this.selectedMeals.push($event);
  }
}
