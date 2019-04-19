public class Capitalized {

    String A = "hello";
    String B = "world";

    public void setCapitalizeFirstLetter() {
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.printf("%s %s", capitalizedA, capitalizedB);
    }

}
