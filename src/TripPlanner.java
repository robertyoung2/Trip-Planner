import java.util.Scanner;


public class TripPlanner {


    public static void main(String [] args) {
        intro();
    }

    public static void intro() {
        // takes in user name and destination

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Trip Planner!");
        System.out.print("What is your name? ");
        String name = "";
        name += input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = "";
        destination += input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
    }

    public static void budget() {
        Scanner input = new Scanner(System.in);
        // takes in the days planned on the trip, allowance, and conversion info

    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        // takes in the time difference between home and destination
    }


    public static void distance() {
        Scanner input = new Scanner(System.in);
        // takes in distance between home and destination in square kilometeres
        // converts into square mile

        // kilometers*0.62137 = miles
    }
}
