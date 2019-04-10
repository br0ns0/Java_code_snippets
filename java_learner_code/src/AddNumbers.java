public class AddNumbers {

    public int addNumbers() {
        int sum = 0;
        // GIVEN RANGE 15 THROUGH 20
        for (int i = 15; i <= 20; i++) {
            sum = sum + i;
            // or like this => sum += i;
        }
        return sum;
    }
}
