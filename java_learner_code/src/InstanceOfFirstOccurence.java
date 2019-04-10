public class InstanceOfFirstOccurence {
    /**
     * Complete the code in this function to find and return the lowest index in the String array stringArray that the String
     * target occurs. If the String target does not occur instringArray, -1 should be returned.
     * SIMPLY: return the index# of the first time the String "Java" occurs(occurrence) within the String[] sentence,
     * if there is no match return -1.
     * RETURN SHOULD BE OF TYPE int
     */

    public class User {

        public int indexOfFirst(String[] stringArray, String target) {
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].equals(target)) {   // example: if stringArray["Learning"] == "Java"
                    return i;
                }
            }
            return -1;
        }

    }

}

//output : 1


