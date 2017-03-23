/**
 * Created by Eduard Maura on 21/03/17
 */
public class CreditCardValidator {
    public boolean isLuhnValid(String creditCardNumber) {
        int number = Integer.parseInt(reverserString(creditCardNumber));
        return isTenDivisible(number);
    }

    private String reverserString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private boolean isTenDivisible(int number) {
        return number % 10 == 0;
    }
}
