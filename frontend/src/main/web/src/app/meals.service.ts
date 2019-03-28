import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { Meal } from './meals/Meal';

import {catchError, map} from 'rxjs/operators';

@Injectable({ providedIn: 'root' })
export class MealsService {

  private mealsUrl = 'http://localhost:8080/meals';  // URL to web api

  constructor(
    private http: HttpClient
  ) { }

  // public static extractData(res: Response) {
  //     // tslint:disable-next-line:prefer-const
  //     let body = res.json();
  //     return body;
  //   }

  getMockData() {
        return this.http.get<Meal[]>(this.mealsUrl);
    }



  /** GET meals from the server */
  // getMeals(): Observable<Meal[]> {
  //   console.log("Calling getMeals() in meals service");
  //   //return this.http.get<Meal[]>(this.mealsUrl);
  //   return this.http.get<Meal[]>(this.mealsUrl).pipe(map(res => res));
  // }

}
