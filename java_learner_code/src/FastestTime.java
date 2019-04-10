public class FastestTime {
    /**
     * Searches an array of cubeTimes
     * for the (smallest) fastest value
     *
     * @ return the fastest speed found
     */
    double[] times = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};

    //method returns the fastest time


    public double fastestRubicTime(double[] cubeTimes) {

        int size = cubeTimes.length; //sets length to iterate i.e(i++)
        double fastestTime = cubeTimes[0]; // sets first value in array cubeTimes to index 0

        for (int i = 1; i < size; i++) {
            if (cubeTimes[i] < fastestTime) {
                fastestTime = cubeTimes[i];
            }
        }
        return fastestTime; // this is returned outside of for-loop and if statement
    }
}

