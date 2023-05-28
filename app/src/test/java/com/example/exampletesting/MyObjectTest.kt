package com.example.exampletesting

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MyObjectTest {
    lateinit var myObject : MyObject

    @Before
    fun setup() {
        myObject = MyObject()
    }

    @Test
    fun testAddNumber() {
        val a = 5
        val b = 10

        val result = myObject.addNumber(a,b)

        assertEquals(15, result)
    }

    @Test
    fun testMultiplyNumber() {
        val a = 2
        val b = 3

        val result = myObject.multiplyNumbers(a,b)
        assertEquals(6, result)
    }
}