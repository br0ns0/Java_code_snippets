public class Capitalized {


    public void setCapitalizeFirstLetter() {
        String A = "hello";
        String B = "world";
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1); //
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.printf("%s %s", capitalizedA, capitalizedB);

    }

}

//0 1 2 3 4
//H e l l o
