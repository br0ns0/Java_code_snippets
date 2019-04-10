public class RandomAlarm {
    // raiseAlarm while loop & for loop

    public void raiseAlarm1(int numOfAlarms) {
        int i = 1;
        while (i <= numOfAlarms) {
            System.out.println("Warning");
            i++;
        }
    }

    public void raiseAlarm2(int numOfWarnings) {
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning #" + i);
        }

    }
}
