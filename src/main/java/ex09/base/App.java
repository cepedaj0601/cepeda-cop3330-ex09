package ex09.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 9 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and
assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value
entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ftPerGal = 350;

        System.out.println("What is the length of the ceiling?");
        int length = in.nextInt();

        System.out.println("What is the width of the ceiling?");
        int width = in.nextInt();

        int ceilingArea = width * length;

        if (ceilingArea < ftPerGal) {
            System.out.println("You will need to purchase 1 gallon of paint to cover "+ ceilingArea +" square feet.");
            System.out.println("Remember, you can’t buy a partial gallon of paint. You must " +
                    "round up to the next whole gallon.");
        }

        else if (ceilingArea % ftPerGal == 0) {
            System.out.println("You will need to purchase "+(ceilingArea / ftPerGal)+" gallons of paint to cover "
                    + ceilingArea +" square feet.");
             }
            else{
                 System.out.printf("You will need to purchase %d gallons of paint to cover ",
                    (ceilingArea / ftPerGal) + 1);
                 System.out.println(ceilingArea +" square feet.");
                 System.out.println("Remember, you can’t buy a partial gallon of paint. You must " +
                    "round up to the next whole gallon.");
            }


    }
}
