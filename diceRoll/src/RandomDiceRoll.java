public class RandomDiceRoll {

    public int diceRoll() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}
