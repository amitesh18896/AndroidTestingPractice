package com.pallaw.testingpractice.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "AndroidUser",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "Pallaw",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "Pallaw",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `repeated confirmed password returns false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "Pallaw",
            "123",
            "124"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`(){
        val result  = RegistrationUtil.validateRegistrationInput(
            "Pallaw",
            "1",
            "1"
        )

        assertThat(result).isFalse()
    }
}