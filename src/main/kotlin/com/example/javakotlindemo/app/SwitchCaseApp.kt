package com.example.javakotlindemo.app

import kotlin.random.Random

fun main() {
    switchFun();
}

fun switchFun() {

    val rand = Random.nextInt(4)

    when(rand) {
        0 -> {
            println(rand)
        }
        (1) -> {
            println(rand)
        }
        else -> {
            println("others")
        }
    }


}