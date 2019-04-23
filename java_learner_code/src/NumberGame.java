import java.util.Scanner;

import java.util.Scanner;

public class NumberGame {


    public void gamePlay() {
        int randomNum = (int) (Math.random() * 1000) + 1;
        boolean hasWon = false;

        System.out.println("I have chosen a random whole number between 1 & 1000");
        System.out.println("Try to guess it!");
        Scanner scan = new Scanner(System.in);

        for (int i = 8; i > 0; i--) { //loop through 7 guesses
            System.out.printf("You have %d guess(es) left!\n\nenter a number: ", i);
            int guess = scan.nextInt(); //stores input as int

            if (randomNum < guess) {
                System.out.printf("the number is less than %d try again\n", guess);
            } else if (randomNum > guess) {
                System.out.printf("the number is greater than %d try again\n", guess);
            } else {
                hasWon = true;
                break;
            }
        }

            if (hasWon) {
                System.out.println("CORRECT YOU WIN!\n\nYou have defeated me human!!\n");

            } else {
                System.out.println("YOU LOSE!!\n\nHow dare you attempt to defeat a machine you primitive human!");
                System.out.printf("HAHA! the random number that I generated was '%d'\n\n\n", randomNum);
                System.out.println("Try again if you DARE!");

            }


        }
    }



