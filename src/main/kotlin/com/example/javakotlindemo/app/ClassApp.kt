package com.example.javakotlindemo.app

import com.example.javakotlindemo.Domain

fun main() {
    val foo = Foo("James", "bundang", true)

    println(foo.name)
    println(foo.male)
    println("isDeveloper : ${foo.isDeveloper}")

    println(Domain().NAVER)

}