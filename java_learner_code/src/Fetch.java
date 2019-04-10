public class Fetch {

    String[] fetchedItems = {"Ball", "Dead Bird", "Stick"};
    int fetchedCounter = 0;
    String name = "Pirate";

    public void goFetch() {

        String[] fetchedItems = {"Ball", "Dead Bird", "Stick"};
        int fetchedCounter = 0;

        this.fetchedCounter = (this.fetchedCounter + 1) % 3;  // 1/3=0 R1 | 2/3=0 R2 | 3/3=0 R0
        String item = this.fetchedItems[this.fetchedCounter];
        System.out.println(this.name + " fetched a " + item + "."); //assume dogs name is "fido"
    }
}
//assume mainclass calls the instance method of dog three times

// dog.goFetch();
// dog.goFetch();
// dog.goFetch();

/**
 * output is:
 * fido fetched a Dead Bird.
 * fido fetched a Stick.
 * fido fetched a Ball.
 */

