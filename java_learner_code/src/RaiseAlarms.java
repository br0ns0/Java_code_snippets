public class RaiseAlarms {

    public void raiseAlarm1(int numOfWarnings) { //uses for loop
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning #" + i);
        }

    }

    public void raiseAlarm2(int numOfAlarms) { // does same as raiseAlarm1 but uses while loop
        int i = 1;
        while (i <= numOfAlarms) {
            System.out.println("Warning");
            i++;
        }
    }


}
