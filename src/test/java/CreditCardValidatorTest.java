import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Eduard Maura on 21/03/17
 */
public class CreditCardValidatorTest {
    @Test
    public void zeroIsValid() {
        CreditCardValidator validator = new CreditCardValidator();
        boolean isValid = validator.isLuhnValid("0");
        assertTrue(isValid);
    }

    @Test
    public void oneIsNotValid() {
        CreditCardValidator validator = new CreditCardValidator();
        boolean isValid = validator.isLuhnValid("1");
        assertFalse(isValid);
    }
}
