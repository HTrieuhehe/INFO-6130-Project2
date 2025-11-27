package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

public class EmailValidatorTest {

    @Test
    fun valideEmailCorrectFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun validEmailSubdomainFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun invalidEmailWrongDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun invalidEmailDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun invalidEmailNoUsername() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun invalidEmailNoDomain() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun invalidEmailEmptyString() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun invalidEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}