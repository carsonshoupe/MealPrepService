import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { Meal } from './meals/Meal';

import {catchError, map} from "rxjs/operators";

@Injectable({ providedIn: 'root' })
export class MealsService {

  private mealsUrl = 'http://localhost:8080/meals';  // URL to web api

  constructor(
    private http: HttpClient
  ) { }

  /** GET meals from the server */
  getMeals(): Observable<Meal[]> {
    return this.http.get<Meal[]>(this.mealsUrl);
  }
}
