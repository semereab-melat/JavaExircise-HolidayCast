//add import statements

import java.text.DecimalFormat;
import java.util.Scanner;
/***************************************************************
 Filename: HolidayCost
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment: calculating the flight fee including transfer fee for a number of people
 ***************************************************************/


class Main 
{
  public static void main(String[] args) 
  {
      final float TAX = 1.2f; // tax will be constant because it would have same value throught the whole operation and 'f' indicates the data type is float.
      Scanner keyboard = new Scanner(System.in); // //setting up a scanner object to get information from the user
      DecimalFormat df = new DecimalFormat("00.00");

      int numPeople; // variable to hold the number of people
      double costFlight, costTransfer, flightCost, transferCost, expecetedOutcome; // declare varibles to hold real numbers

      System.out.println("How many people are travelling? ");
      numPeople = keyboard.nextInt();

      System.out.println("\nEnter the cost of each flight: £");
      costFlight = keyboard.nextDouble();

      System.out.println("Enter the cost of each transfer: £");
      costTransfer = keyboard.nextDouble();

      flightCost = numPeople * costFlight * TAX;
      transferCost = numPeople * costTransfer * TAX;
      expecetedOutcome = flightCost + transferCost;

      System.out.println("\nTotal cost for flights: " + "£" + df.format(flightCost));
      System.out.println("Total cost for transfers: " + "£" + df.format(transferCost));
      System.out.println("\nTotal cost: " + "£" + df.format(expecetedOutcome) +" ");

    
  }//main
}//class