package edu.psu

import org.apache.commons.validator.routines.EmailValidator
import org.apache.commons.validator.routines.UrlValidator
import org.junit.Test

class ValidatorTest {
    @Test
    public void checkURL() {
        String url = 'http://psu.edu'
        assert(new UrlValidator().isValid(url))
    }

    @Test
    public void checkEmail() {
        assert(EmailValidator.getInstance(false)
                    .isValid('fred@psu.edu'))
    }
}
