
public class ReverseWord {

    /**
     * Given a string , this method print Yes if it is a palindrome, print No otherwise.
     * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
     *
     * @param word
     */
    public void flipWord(String word) {
        System.out.println(word.equals(new StringBuilder(word).reverse().toString()) ? "Yes" : "No");



    }
}

