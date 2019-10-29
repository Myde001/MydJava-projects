package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        greeting();
        budget();
        time();
        landArea();
    }
        public static void greeting() {
            System.out.println("Welcome to Vacation Planner!");
            Scanner input = new Scanner(System.in);
            System.out.print("What is your name");
            String name = input.nextLine();
            Scanner mora = new Scanner(System.in);
            System.out.print("Nice to meet you " + name+ ", where are"+ ", where are you travelling to?");
            String destination = mora.nextLine();
            System.out.println("Great! "+ destination+ " sounds like a great trip");
        }

        public static void budget() {
        Scanner duration= new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int days = duration.nextInt();
        Scanner owo = new Scanner (System.in);
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double cash = owo.nextDouble();
        Scanner currency = new Scanner(System.in);
        System.out.print("what is the three letter currency symbol for your travel destination?");
        String symbol = currency.next();
        Scanner rate = new Scanner(System.in);
        System.out.print("How many "+ symbol+" are there in 1 USD?");
        double rate2= rate.nextDouble();

        int hours = days*24; //Total time on vacation in hours
        int minutes = days*24*60; //Total time on vacation in minutes
        double dailySpend = cash/days; //daily spend in USD
        int dailySpend2 = (int) (dailySpend*100);
        double dailySpend3 = dailySpend2/100.0;
        double total= rate2*cash; //total expenses in local currency
            int total2 = (int) (total*100);
            double total3 = total2/100.0;
        double dailyTotal = total/days; //Daily expenses in local currency
            int dailyTotal2 = (int) (dailyTotal*100);
            double dailyTotal3 = dailyTotal2/100.0;

        System.out.println("If you are travelling for " + days+ " days that is the same as "+" "+hours+" hours"+" or "+minutes+" minutes");
        System.out.println("If you are going to spend $"+cash+" USD that means per day you can spend up to $"+dailySpend3+" USD");
        System.out.println("Your total budget in "+symbol+" is "+total3+" "+symbol+", which per day is "+dailyTotal3+" "+symbol);
        }

        public static void time() {
        Scanner localTime = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination");
        int timeZone = localTime.nextInt();
        int timeZone2 = (timeZone+24)%24; // this is done to take into consideration negative timezone
        System.out.println("That means that when it is midnight at home it will be "+timeZone2+":00 in your travel destination");
        int finalTime= timeZone2+12;
        System.out.println("and when it is noon at home, it will be "+ finalTime+":00");
        }

        public static void landArea() {
        Scanner landMass = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2?");
        double land = landMass.nextDouble();
        double miles = land/2.58999; // landmass in mile2
            int miles2 = (int) (miles*100);
            double miles3 = miles2/100.0;
        System.out.println("in miles2 that is "+miles3);
        }

}
