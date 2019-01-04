import java.util.Scanner;
import java.lang.Math;

public class TripPlanner {

    public static void main(String [] args) {
        intro();
        budget();
        time();
        distance();
        measured_distance();
    }

    // takes in user name and destination
    public static void intro() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Trip Planner!");
        System.out.print("What is your name? ");
        String name = "";
        name += input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = "";
        destination += input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");

        System.out.println("**********");
        System.out.println();
    }

    // takes in the days planned on the trip, allowance, and conversion info
    public static void budget() {

        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int travel_days = input.nextInt();
        System.out.print("How much money, in EUR, are you planning to spend on your trip? ");
        double budget = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 EUR? ");
        double conversion = input.nextDouble();
        System.out.println();

        int hours = travel_days * 24;
        int minutes = hours * 60;
        double daily_budget =  budget / travel_days;
        double db_round = Math.round(daily_budget * 100) / 100.0;
        double local_budget = (budget * conversion);
        double daily_local_budget = local_budget / travel_days;
        double dl_round = Math.round(daily_local_budget * 100) / 100.0;

        System.out.println("If you are travelling for " + travel_days + " days that is the same as " + hours + " hours or " +
                minutes + " minutes");
        System.out.println("If you are going to spend €" + budget + " that means per day you can spend up to €" +
                db_round + " EUR" );
        System.out.println("Your total budget in " + symbol + " is " + local_budget + " " + symbol + ", which per day " +
                "is " + dl_round + " " + symbol);

        System.out.println("**********");
        System.out.println();

    }

    // takes in the time difference between home and destination
    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time_diff = input.nextInt();
        int diff_corrected = time_diff % 24;
        int midnight = Math.abs(diff_corrected);
        int noon = Math.abs(diff_corrected + 12);

        System.out.println("That means that when it is midnight at home it will be " + midnight + ":00" + " in your travel destination " +
                "and when it is noon at home it will be " + noon + ":00");

        System.out.println("**********");
        System.out.println();

    }

    // takes in distance between home and destination in square kilometeres
    // converts into square mile
    // kilometers*0.62137 = miles
    public static void distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int area_km = input.nextInt();
        double area_miles = area_km * 0.38610;
        System.out.println("In miles squared that is: " + area_miles);

        System.out.println("**********");
        System.out.println();

    }

    // Method to calculate distance between two locations
    public static void measured_distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the longitude of your starting location? ");
        double start_long = input.nextDouble();
        System.out.print("what is the latitude of your starting location? ");
        double start_lat = input.nextDouble();
        System.out.print("What is the longitude of your final destination? ");
        double final_long = input.nextDouble();
        System.out.print("what is the latitude of your final destination? ");
        double final_lat = input.nextDouble();

        double R = 6378137;

        double lat_1 =  Math.toRadians(start_lat);
        double lat_2 =  Math.toRadians(final_lat);
        double lat_diff = Math.toRadians(final_lat - start_lat);
        double long_diff = Math.toRadians(final_long - start_long);

        double a = Math.sin(lat_diff/2) * Math.sin(lat_diff/2) + Math.cos(lat_1) * Math.cos(lat_2) * Math.sin(long_diff
        /2) * Math.sin(long_diff/2);

        var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        var distance = R * c;

        System.out.print(distance);

    }
}
