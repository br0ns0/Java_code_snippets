//yahtzee /while loop/ random number generator

public class Yahtzee {

    public int diceRoll() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    public int keepRolling() {
        int dice1 = diceRoll();
        int dice2 = diceRoll();
        int dice3 = diceRoll();
        int dice4 = diceRoll();
        int dice5 = diceRoll();
        int count = 1;
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = diceRoll();
            dice2 = diceRoll();
            dice3 = diceRoll();
            dice4 = diceRoll();
            dice5 = diceRoll();

            count += 1;
        }
        return count;
    }
}
