package com.pallaw.testingpractice.utils

object RegistrationUtil {

    private val existingUsers = listOf<String>("Pallaw", "Prafull")

    /**
     * The input is not valid if....
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as real password
     * ...the password contains less then 2 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if (userName.isEmpty() || password.isEmpty())
            return false

        if (userName in existingUsers)
            return false

        if (password != confirmedPassword)
            return false

        if (password.count { it.isDigit() } < 2)
            return false

        return true
    }
}