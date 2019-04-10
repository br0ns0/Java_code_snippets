public class LongestName {

    /**
     * a function that searches
     * an array of Strings and finds the longest name
     */

    String[] names = {"Bronson", "Aroura", "laurel", "Robert", "Caleb", "Little Bronson", "Lisa", "Rickey"};

    // the method that returns the longest String within the array of Strings


    public String findLongestName() {
        int size = names.length;
        String longestName = this.names[0];

        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) { //compares length of Strings
                longestName = this.names[i];
            }
        }
        return longestName; //correct output is "Little Bronson"
    }


}

