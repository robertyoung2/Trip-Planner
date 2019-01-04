import java.util.Scanner;
import java.lang.Math;

public class TripPlanner {

    public static void main(String [] args) {
        intro();
        budget();
        time();
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
                db_round + "EUR" );
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


    public static void distance() {
        Scanner input = new Scanner(System.in);
        // takes in distance between home and destination in square kilometeres
        // converts into square mile

        // kilometers*0.62137 = miles
    }
}
