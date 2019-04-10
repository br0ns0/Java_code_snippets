public class FindRange {
    /**
     * find the smallest value in the parameter array, and find the largest value, and
     * return the largest value minus the smallest value. If the array has length 0, return -1.
     * int[] myIntArray = {1, 0, 2, 3, -1, 2};
     */


    public class User {
        public int getRange(int[] intArray) {
            int size = intArray.length; //size 6
            if (size == 0) {
                return -1;
            }
            int smallestNum = intArray[0]; // smallestNum = 1
            int largestNum = intArray[0];

            for (int i = 1; i < size; i++) {
                if (intArray[i] < smallestNum) {
                    smallestNum = intArray[i];
                }
                if (intArray[i] > largestNum) {
                    largestNum = intArray[i];
                }
            }

            return largestNum - smallestNum;

        }

    }
}
