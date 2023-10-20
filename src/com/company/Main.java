package com.company;

 import java.util.Random;

 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create Scanner

        Scanner input = new Scanner(System.in);



        // prompt user to roll

        System.out.println("Roll the dice? (y/n):");

        String answer = input.next();



        // while user wants to roll

        while(answer.equalsIgnoreCase("y")) {


            // generate two random numbers and add them

            Random rand = new Random();

            int die1 = rand.nextInt(6) + 1;

            int die2 = rand.nextInt(6) + 1;

            int sum = die1 + die2;


            // print the dice values and the sum

            System.out.println("Die 1: " + die1);

            System.out.println("Die 2: " + die2);

            System.out.println("Sum: " + sum);


            // check for craps or natural

            if (sum == 7 || sum == 11) {

                System.out.println("You Win! You rolled a natural.");

                System.out.println("Roll the dice again? (y/n):");

                answer = input.next();

            } else if (sum == 2 || sum == 3 || sum == 12) {

                System.out.println("You Lose! You crapped out.");

                System.out.println("Roll the dice again? (y/n):");

                answer = input.next();

            } else {

                int point = sum;

                System.out.println("You have established your point of " + point + ".");


                // roll until you make point or roll a 7

                int roll = 0;

                while (roll != point && roll != 7) {

                    die1 = rand.nextInt(6) + 1;

                    die2 = rand.nextInt(6) + 1;

                    roll = die1 + die2;

                    System.out.println("You rolled a " + roll + ". Trying for point.");

                }


                if (roll == point) {

                    System.out.println("You Win! You made your point of " + point + ".");

                    System.out.println("Roll the dice again? (y/n):");

                    answer = input.next();

                } else if (roll == 7) {

                    System.out.println("You Lose! You rolled a 7.");

                    System.out.println("Roll the dice again? (y/n):");

                    answer = input.next();

                }

            }

        }
    }
}

