import {Component, Input, OnInit} from '@angular/core';
import {MatRadioButton} from "@angular/material";

@Component({
  selector: 'app-pricing',
  templateUrl: './pricing.component.html',
  styleUrls: ['./pricing.component.css']
})

export class PricingComponent implements OnInit {

  constructor( ) { }

  ngOnInit() { }

  selectedNumOfMeals: number;
  selectedPortionSize: string;

  numOfMealsObjs = [
    {"num": 6, "checked": true},
    {"num": 12, "checked": false },
    {"num": 24, "checked": false}
    ];
  portionSizes: string[] = ["Small", "Large"];
  portionSizeDescriptions = {
    "Small": "2-3 Servings",
    "Large": "4-6 Servings"
  }



}
