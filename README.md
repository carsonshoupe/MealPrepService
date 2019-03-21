# MealPrepService
PM: Jessica McMicheaux \
Developers: Haris Ahmed, Carson Shoupe \
\
Description: 
Users should be able to: 
1. Select a meal plan
2. Select meals
3. Place an order, which is emailed to the application owner

JSON Contract -- Meal objects sent as a JSON list in the following format: \

{ \
&nbsp;    "id": num, \
&nbsp;    "name": "name", \
&nbsp;    "protein": "protein", \
&nbsp;    "description": "description", \
&nbsp;    "cookTime": num, \
&nbsp;    "cookType": "cookType", \
&nbsp;    "recommendedSides": [ \
&nbsp;&nbsp;        "side", \
&nbsp;&nbsp;        "side" \
&nbsp;    ], \
&nbsp;    "nutritionInfo": { \
&nbsp;&nbsp;        "calories": num, \
&nbsp;&nbsp;        "totalFat": num, \
&nbsp;&nbsp;        "cholesterol": num, \
&nbsp;&nbsp;        "sodium": num, \
&nbsp;&nbsp;        "carbs": num, \
&nbsp;&nbsp;        "dietaryFiber": num, \
&nbsp; &nbsp;       "sugar": num, \
&nbsp; &nbsp;       "protein": num \
&nbsp;    },\
&nbsp;    "glutenFree": bool, \
&nbsp;    "vegetarian": bool, \
&nbsp;    "vegan": bool \
}

