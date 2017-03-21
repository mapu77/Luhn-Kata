import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    private void assertIsLuhnValid(Boolean expected, String creditCardNumber) {
        CreditCardValidator validator = new CreditCardValidator();
        boolean isValid = validator.isLuhnValid(creditCardNumber);
        assertEquals(expected, isValid);
    }
}
