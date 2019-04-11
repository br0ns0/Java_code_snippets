import java.util.Random;

public class Monopoly {

    /**
     * a function that does the same except it continues rolling unti two non-equal values appear on the two dice.
     * write the monopolyRoll() function by calling monopolyRoll() inside the function itself to handle the case
     * where further rolls are made.
     */

    public int monopolyRoll() {
        int roll1 = diceRoll(6); //Generate two random numbers in the 1 to 6 range.
        int roll2 = diceRoll(6);
        if (roll1 != roll2) {
            return roll1 + roll2; //2. If they are not the same, return the sum of all numbers rolled so far.
        } else {
            //In the case where the two rolls are equal, we want to
            //return the current roll plus the return value of another
            //call to monopolyRoll(). This is called making a
            //recursive call. The recursive call will handle making
            //additional rolls, and recursive calls will keep getting
            //made until a roll is made where the two values are not
            //equal.
            return roll1 + roll2 + monopolyRoll(); //3. If they are the same, keep track of the total rolled so far and return to step 1.
        }
    }

    public int diceRoll(int sides) {
        double randomNumber = Math.random() * sides; // 6 represents how many sides on dice
        randomNumber += 1;
        int randomInt = (int) randomNumber; // cast to return whole number
        return randomInt;
    }
}



