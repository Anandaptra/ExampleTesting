package com.example.exampletesting

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterTest {
    lateinit var regist : Register
    @Before
    fun setUp(){
        regist = Register()
    }

    @Test
    fun passwordEmpty_false(){
        val result = regist.validateRegistrationInput("farhan","","12345")
        assertEquals("password empty", result, false)
    }
}