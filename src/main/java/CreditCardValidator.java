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
            int doubled = doubleCharNumber(number.charAt(i));
            if (hasTwoDigits(doubled)) doubled -= 9;
            sum += doubled;
        }
        return sum;
    }

    private int processOdds(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i += 2) {
            sum += convertCharToInt(number.charAt(i));
        }
        return sum;
    }

    private int convertCharToInt(Character digit) {
        return Integer.parseInt(digit.toString());
    }

    private int doubleCharNumber(Character digit) {
        return convertCharToInt(digit) * 2;
    }

    private boolean hasTwoDigits(int number) {
        return number > 9;
    }

    private String stringReverser(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private boolean isTenDivisible(int number) {
        return number % 10 == 0;
    }
}
