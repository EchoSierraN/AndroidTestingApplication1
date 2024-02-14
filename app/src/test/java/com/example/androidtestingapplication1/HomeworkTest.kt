package com.example.androidtestingapplication1

import com.google.common.truth.Truth
import org.junit.Test

class HomeworkTest{

    @Test
    fun `nth fibonacci for three numbers is calculated accurately`() {
        val result1 = Homework.fib(0)
        val result2 = Homework.fib(1)
        val result3 = Homework.fib(6)

        Truth.assertThat(result1).isEqualTo(0)
        Truth.assertThat(result2).isEqualTo(1)
        Truth.assertThat(result3).isEqualTo(5)
    }

    @Test
    fun `does not contain braces returns true`() {
        val result = Homework.checkBraces("hello world")

        Truth.assertThat(result).isTrue()
    }

    @Test
    fun `unmatching number of open and closing braces returns false`() {
        val string1 = "[[helloworld]"
        val string2 = "[[helloworld]]"

        val result1 = Homework.checkBraces(string1)
        val result2 = Homework.checkBraces(string2)

        Truth.assertThat(result1).isFalse()
        Truth.assertThat(result2).isTrue()
    }
}