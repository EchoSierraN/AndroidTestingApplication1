package com.example.androidtestingapplication1

object RegistrationUtil {

    private val existingUsers = listOf("Elias", "Fanthood")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ) : Boolean {

        if (username.isEmpty()) return false
        if (username in existingUsers) return false
        if (password.isEmpty() || confirmPassword.isEmpty()) return false
        if (password != confirmPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        if (countSpecialCharacters(username) > 2) return false

        return true;
    }

    private fun countSpecialCharacters(input: String): Int {
        val regex = Regex("[^A-Za-z0-9 ]")
        var count = 0
        for (char in input) {
            if (regex.matches(char.toString())) {
                count++
            }
        }
        return count
    }

}