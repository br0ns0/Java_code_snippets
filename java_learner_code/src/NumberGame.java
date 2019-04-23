import java.util.Scanner;

import java.util.Scanner;

public class NumberGame {


    public void gamePlay() {
        int randomNum = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have chosen a random whole number between 1 & 100");
        System.out.println("Try to guess it!");
        Scanner scan = new Scanner(System.in);

        for (int i = 10; i > 0; i--) { //loop through 10 guesses
            System.out.printf("You have %d guess(es) left!\n\nenter a number: ", i);
            int guess = scan.nextInt(); //stores input as int

            if (randomNum > guess) {
                System.out.println("Your guess is less than my number");
            } else if (randomNum < guess) {
                System.out.println("Your number is larger than my number");
            } else {
                hasWon = true;
            }

            if (hasWon) {
                System.out.println("You WIN! You have defeated me human!!\n");
                break; //exits loop
            } else {
                System.out.println("You LOSE!! How dare you attempt to defeat a machine you primitive human!");
                System.out.printf("The random number that I generated was '%d'\n", randomNum);
                System.out.println("Try again if you DARE!");

            }


        }
    }


}
