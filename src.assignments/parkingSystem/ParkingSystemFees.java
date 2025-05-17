package parkingSystem;

import java.util.Scanner;

public class ParkingSystemFees {

    public void publicSystem (){

    }

    //QUESTION:
    //Write a Java program that calculates parking fees based on the following:
    //First 2 hours: Free
    //Next 3 hours: Rs. 10 per hour
    //Beyond 5 hours: Rs. 15 per hour
    //Throw InvalidDurationException if the number of hours is negative.

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Welcome to this Parking System");
        System.out.print ("Enter parking time in hours:");
        int parkingHours = scanner.nextInt();

        if (parkingHours < 0){
            System.out.println("Error: Invalid parking duration. (It Cannot be Negative hours)");
        }

        else{
            int parkingFeeAmount = 0;


            if (parkingHours <= 2) {
                parkingFeeAmount = 0;
            }

            else if (parkingHours <= 5) {
                parkingFeeAmount = (parkingHours -2) * 10;
            }

            else{
                parkingFeeAmount = (3 * 10) + (parkingHours -5) * 15;
            }

            System.out.println("Parking Duration: " + parkingHours + " hours");
            System.out.println("Total parking fee: Rs. " + parkingFeeAmount);

            System.out.println("\nFee breakdown:");
            if (parkingHours <= 2) {
                System.out.println("First " + parkingHours + " hours: Free");
            } else if (parkingHours <= 5) {
                System.out.println("First 2 hours: Free");
                System.out.println("Next " + (parkingHours - 2) + " hours: Rs. " + ((parkingHours - 2) * 10));
            } else {
                System.out.println("First 2 hours: Free");
                System.out.println("Next 3 hours: Rs. 30");
                System.out.println("Remaining " + (parkingHours - 5) + " hours: Rs. " + ((parkingHours - 5) * 15));
            }
        }

        scanner.close();
    }
}