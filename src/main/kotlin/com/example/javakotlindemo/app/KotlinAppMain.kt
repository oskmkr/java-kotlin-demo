package com.example.javakotlindemo.app

import org.apache.coyote.http11.Constants.a

fun main(vararg args: String) {
    println(sum(1, 2));

    val mutl = { a: Int, b: Int -> a * b }

    println(mutl(1, 2))

    val minus: (Int, Int) -> Int = { a, b -> a - b }

    println(minus(2, 1))

    val greet: (String) -> Unit = { a -> println(a) }
    val greet2 = { a: String -> println(a) }
    val greet3 : () -> Unit = {
        println("Hello")
    }

    val greet4 = {
        println("Hello");
        println("Kotlin")
    }

}

fun sum(a: Int, b: Int): Int {
    return a + b
}