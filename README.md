# Trip-Planner

A project as part of Microsoft's DEV276x Java course on edX. The source code for my completed implementation can be found [here](https://github.com/robertyoung2/Trip-Planner/blob/master/src/TripPlanner.java).

The purpose of the project is to build a trip planner for a user that is broken down into a number of methods as follows:

### Part 1 - Greeting
1. Greet the user and ask their name. 
2. Ask them where they would like to go for their trip

### Part 2 - Travel Time and Budget
Ask the user:
1. How many days are they going to spend in their destination?
2. What is their total budget for the trip in USD?
3. What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EU etc…
4. The conversion rate between 1 USD to however many of that destinations currency. For example, there are 0.9 euro to 1 usd, so the user would type in 0.9

Once all of this is stored, tell the user the following information:

1. How much time the user will spend at their destination in days, hours, minutes and seconds
2. Show the user their budget in USD for the whole trip and how much they can spend in USD per day
3. Show the user their budget in the travel destination’s currency for the total trip and per day

### Part 3 - Time Difference

Show the time it will be in the travel destination when it is midnight at home and when it is noon at home. You can report these in 24 format, where midnight is 0:00 and noon is 12:00.

### Part 4 - Country Area

Only three countries in the world us the "imperial system", so most countries report their distances in kilometers. For this part, ask the user the area of their travel destination country in km^2. Then you’ll want to convert that to miles^2 and report those results back to the user.

### Part 5 (Bonus) - How Far?

Calculate the distance between the users start and final destination using longitutude and latitude values entered by the user for each of the two locations.
