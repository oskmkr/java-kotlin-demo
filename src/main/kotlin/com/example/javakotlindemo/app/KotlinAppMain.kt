package com.example.javakotlindemo.app

fun main(vararg args: String) {
    println(sum(1, 2));

    val mutl = { a: Int, b: Int -> a * b }

    println(mutl(1, 2))

    val minus: (Int, Int) -> Int = { a, b -> a - b }

    println(minus(2, 1))

    val greet: (String) -> Unit = { a -> println(a) }
    val greet2 = { a: String -> println(a) }
    val greet3: () -> Unit = {
        println("Hello")
    }

    val greet4 = {
        println("Hello");
        println("Kotlin")
    }

    variableArgSum(1, 2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun variableArgSum(vararg arg: Int): Int {

    var sum = 0;
    for (each in arg) {
        sum += each;
    }
    return sum
}