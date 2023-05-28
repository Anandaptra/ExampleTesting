package com.example.exampletesting

import org.junit.Assert.*
import org.junit.Test

class RegristationUtilTest {
    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegristationUtil.validateRegistrationInput(
            "jo",
            "12345",
            "12345"
        )
        assertEquals("oke",result,true)
    }

    @Test
    fun usernameEmpty(){
        val user = "Dar"
        val result = RegristationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("oke",result,true)
    }

    @Test
    fun existingUsername(){
        val user= "Jo"
        val result = RegristationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("usernameexist", result,true)
    }

    @Test
    fun testPasswordWithLessThanTwoDigits() {
        val result = RegristationUtil.validateRegistrationInput(
            "Jo",
            "Abcd",
            "Abcd"
        )
        assertEquals(false, result)
    }

    @Test
    fun testDifferentConfirmedPassword() {
        val result = RegristationUtil.validateRegistrationInput(
            "Jo",
            "Abcd1234",
            "Abcd5678"
        )
        assertEquals(false, result)
    }

    @Test
    fun testEmptyPassword() {
        val result = RegristationUtil.validateRegistrationInput(
            "JohnDoe",
            "",
            ""
        )
        assertEquals(false, result)
    }
}