/**
 * Created by Eduard Maura on 21/03/17
 */
public class CreditCardValidator {
    public boolean isLuhnValid(String creditCardNumber) {
        String reversedCreditCardNumber = stringReverser(creditCardNumber);
        int s1 = processOdds(reversedCreditCardNumber);
        int s2 = processEvens(reversedCreditCardNumber);
        return isTenDivisible(s1 + s2);
    }

    private int processEvens(String number) {
        int sum = 0;
        for (int i = 1; i < number.length(); i += 2) {
            Character digit = number.charAt(i);
            int twoTimes = Integer.parseInt(digit.toString()) * 2;
            if (twoTimes > 9) twoTimes -= 9;
            sum += twoTimes;
        }
        return sum;
    }

    private int processOdds(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i += 2) {
            Character digit = number.charAt(i);
            sum += Integer.parseInt(digit.toString());
        }
        return sum;
    }

    private String stringReverser(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private boolean isTenDivisible(int number) {
        return number % 10 == 0;
    }
}
