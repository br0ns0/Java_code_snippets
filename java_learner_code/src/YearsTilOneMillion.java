public class YearsTilOneMillion {
    /**
     * A savings account yields 5% interest annually. This Java function is designed to determine
     * how many years it will take for you to have $1,000,000 on deposit given an initial value. The
     * parameter represents the initial deposit, and the function should return an integer number
     * of years before there will be $1,000,000 or more in the account.
     *
     * @param initialBalance
     * @return years til you reach ONE_MILLION
     */

    public int yearsTil(double initialBalance) {

        double balance = initialBalance;
        double annualInterestRate = 1.05;
        // annual rate =.05/ but 0.5 *1000= 50.0? | add ONE so, balance = balance + interest => 1 + .05 *1000 = 1050
        final int ONE_MILLION = 1000000;
        int years = 0;

        while (balance < ONE_MILLION) {
            years++;
            balance *= annualInterestRate;
        }
        return years;

    }
}