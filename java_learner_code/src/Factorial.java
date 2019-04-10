public class Factorial {
    /**
     * Complete the factorial() function below. It should return the product of all the number from 1 to the parameter n.
     * For example, factorial(5) should return 120 because 1 x 2 x 3 x 4 x 5 = 120.
     * Think about what kind of loop you want to use to accomplish this.
     */

    public int getfactorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }


        return sum;
    }
}
