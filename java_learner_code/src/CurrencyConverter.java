
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    //Given a double-precision number, , denoting an amount of money,
    // use the NumberFormat class' getCurrencyInstance method to convert into
    // the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

    //US: formattedPayment
    //India: formattedPayment
    //China: formattedPayment
    //France: formattedPayment

    public void setCurrency() {
        double payment = 150000;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.printf("US: %s\nIndia: %s\nChina: %s\nFrance: %s",
                defaultFormat.format(payment), indiaFormat.format(payment),
                chinaFormat.format(payment), franceFormat.format(payment));
    }
}

