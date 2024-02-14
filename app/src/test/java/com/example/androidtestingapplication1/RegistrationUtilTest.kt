package com.example.androidtestingapplication1

import com.google.common.truth.Truth
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty user name returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "", "123", "123"
        )

        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ermhood", "123", "123"
        )

        Truth.assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val resultErmhood = RegistrationUtil.validateRegistrationInput(
            "Ermhood", "123", "123"
        )

        val resultFanthood = RegistrationUtil.validateRegistrationInput(
            "Fanthood", "123", "123"
        )

        Truth.assertThat(resultErmhood).isTrue()
        Truth.assertThat(resultFanthood).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val resultPassword =
            RegistrationUtil.validateRegistrationInput("Paulos", "", "paulos")
        val resultConfirmation =
            RegistrationUtil.validateRegistrationInput("Paulos", "paulos", "")
        val resultBoth =
            RegistrationUtil.validateRegistrationInput("Paulos", "", "")

        Truth.assertThat(resultPassword).isFalse()
        Truth.assertThat(resultConfirmation).isFalse()
        Truth.assertThat(resultBoth).isFalse()

    }
    @Test
    fun `passwords don't match returns false`() {
        val resultErmhood = RegistrationUtil.validateRegistrationInput(
            "Ermhood", "123", "124"
        )

        Truth.assertThat(resultErmhood).isFalse()
    }

    //password contains less than two (numerical) digits
    @Test
    fun `password of less than two (numerical) digits returns false`() {
        val resultErmhood = RegistrationUtil.validateRegistrationInput(
            "Ermhood", "1", "1"
        )

        Truth.assertThat(resultErmhood).isFalse()
    }

    @Test
    fun `more than two special characters in username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Juckb^X&W0@gmail.com", "124", "124"
        )

        Truth.assertThat(result).isFalse();
    }

}