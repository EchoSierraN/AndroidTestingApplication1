package com.example.androidtestingapplication1

object Homework {
    /**
     * returns the nth fibonacci number
     * they are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int) : Long {
        if (n == 0 || n==1) {
            return n.toLong()
        }

        var a = 0L
        var b  = 1L
        var c = 1L

        (1..n-2).forEach{ i ->
            c = a + b
            a = b
            b = c
        }

        return c
    }


    /**
     * checks whether or not the number of closing braces
     * equals the number of opening braces in a string
     * @param string the string to be checked
     */
    fun checkBraces(string: String) : Boolean {
        return string.count { it == '[' } == string.count{it == ']' }
    }
}