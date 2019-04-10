public class RollASix {

    // if you roll a 6 you win and the game is over. If you roll a 3 you lose
// and the game is over.


    public boolean rollSix() {
// 		ASSUME diceRoll() is a method that rolls a dice
        int dice = diceRoll();

        while (dice != 6) {
            dice = diceRoll();
            if (dice == 3)
                break;
            return (dice == 6);

        }
        return false;
    }


    public int diceRoll() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}
