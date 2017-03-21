/**
 * Created by Eduard Maura on 21/03/17
 */
public class CreditCardValidator {
    public boolean isLuhnValid(String creditCardNumber) {
        int number = Integer.parseInt(creditCardNumber);
        return number % 10 == 0;
    }
}
