package com.example.javakotlindemo.app

fun main(vararg args: String) {

    loop1()
    loop2()
    loop3("가", "나")
    loop4("A", "B", "C")
}

fun loop1() {
    for (i in 0 until 11) {
        print(i);
    }
}

fun loop2() {
    for (i in 0..10 step 3) {
        print(i)
    }
}

fun loop3(vararg args : Any) {
    for(each in args) {
        println(each)
    }
}

fun loop4(vararg args : Any) {
    for((idx, each) in args.withIndex()) {
        println("${idx}, ${each}")
    }
}