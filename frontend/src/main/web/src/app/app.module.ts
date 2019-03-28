import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {MatRadioModule} from '@angular/material/radio';

import { AppComponent } from './app.component';
import { MealsComponent } from './meals/meals.component';
import {PricingComponent} from "./pricing/pricing.component";

import { HttpClientModule }    from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MealsComponent,
    PricingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    MatRadioModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
