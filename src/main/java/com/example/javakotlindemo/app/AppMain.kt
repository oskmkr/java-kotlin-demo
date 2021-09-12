package com.example.javakotlindemo.app

object AppMain {
    @JvmStatic
    fun main(args: Array<String>) {
        println(sum(1, 2))
        println(sum(sum(3, 4), 2))
        val a: Int
        a = 0
        println(a)
    }

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }
}