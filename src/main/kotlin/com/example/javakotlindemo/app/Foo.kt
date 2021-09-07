package com.example.javakotlindemo.app

// 프로퍼티가 자동으로 생성된다.
// Lombok 같은 효과
// 기본 접근 제한자가 public 이다.
class Foo(val name: String, var address: String, val male: Boolean) {

    val isDeveloper: Boolean
        get() {
            return name == "James"
        }
}