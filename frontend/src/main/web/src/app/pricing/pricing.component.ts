import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-pricing',
  templateUrl: './pricing.component.html',
  styleUrls: ['./pricing.component.css']
})

export class PricingComponent implements OnInit {

  constructor( ) { }

  ngOnInit() { }

  @Output() numOfMealsOutput = new EventEmitter<number>();
  @Output() portionSizeOutput = new EventEmitter<string>();

  numOfMealsChanged() {
    this.numOfMealsOutput.emit(this.selectedNumOfMeals);
    this.updatePrice()
  }

  portionSizeChanged() {
    this.portionSizeOutput.emit(this.selectedPortionSize);
    this.updatePrice()
  }

  selectedNumOfMeals: number;
  selectedPortionSize: string;
  price: number;

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

  priceMapper: any = {
    "6": {"Small": 70, "Large": 120 },
    "12": {"Small": 140,"Large": 200 },
    "24": {"Small": 210,"Large": 280 }
  }

  updatePrice() {
    if (this.selectedNumOfMeals === undefined || this.selectedPortionSize === undefined) {
      return
    }
    this.price = this.priceMapper[this.selectedNumOfMeals][this.selectedPortionSize]
  }



}
