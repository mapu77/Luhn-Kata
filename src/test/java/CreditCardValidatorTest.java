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

    private void assertIsLuhnValid(Boolean expected, String creditCardNumber) {
        CreditCardValidator validator = new CreditCardValidator();
        boolean isValid = validator.isLuhnValid(creditCardNumber);
        assertEquals(expected, isValid);
    }
}
