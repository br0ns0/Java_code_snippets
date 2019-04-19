
public class ReverseWord {

    /**
     * Given a string , this method print Yes if it is a palindrome, print No otherwise.
     * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
     *
     * @param word
     */
    public void flipWord(String word) {
        String reverse = "";                           // 0  1  2  3  4  5
        for (int i = word.length() - 1; i >= 0; i--) { // m  a  d  a  m     length()-1 will begin at index[4] NOT index[5]
            reverse += word.charAt(i); //
        }
        System.out.println(word.equals(reverse) ? "Yes" : "No"); // //ternary operator (condition ? "Yes" \\ "No")


    }
}

