import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Eduard Maura on 21/03/17
 */
public class CreditCardValidatorTest {
    @Test
    public void zeroIsValid() {
        assertIsLuhnValid(true, "0");
    }


    @Test
    public void oneIsNotValid() {
        assertIsLuhnValid(false, "1");
    }

    @Test
    public void oneZeroIsNotValid() {
        assertIsLuhnValid(false, "10");
    }

    @Test
    public void oneEightIsValid() {
        assertIsLuhnValid(true, "18");
    }

    @Test
    public void nineOneIsValid() {
        assertIsLuhnValid(true, "91");
    }

    @Test
    public void sixOneTwoIsValid() {
        assertIsLuhnValid(true, "612");
    }

    @Test
    public void oneTwoThreeIsNotValid() {
        assertIsLuhnValid(false, "123");
    }

    @Test
    public void someLongNumberAreValid() {
        assertIsLuhnValid(true, "49927398716");
        assertIsLuhnValid(true, "79927398713");
    }

    @Test
    public void someLongNumberAreNotValid() {
        assertIsLuhnValid(false, "49927398712");
        assertIsLuhnValid(false, "79927398715");
    }

    private void assertIsLuhnValid(Boolean expected, String creditCardNumber) {
        CreditCardValidator validator = new CreditCardValidator();
        boolean isValid = validator.isLuhnValid(creditCardNumber);
        assertEquals(expected, isValid);
    }
}
