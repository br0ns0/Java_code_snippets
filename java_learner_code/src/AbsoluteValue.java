public class AbsoluteValue {
    //assume number is negeative example: -23

    public double absoluteValue(double number) {
        if (number < 0) {
            return -number;  //returns absolute value
            //  OR   return Math.abs(number); //returns absolute value as well


        }
        return number;
    }
}
