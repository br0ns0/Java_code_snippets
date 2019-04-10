public class RandomDiceRoll {

    public int diceRoll() {
        double randomNumber = Math.random() * 6; // 6 represents how many sides on dice
        randomNumber += 1;
        int randomInt = (int) randomNumber; // cast to return whole number
        return randomInt;
    }
}
