package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 构造函数中的默认参数

class Teacher2(name: String = "王老师") {
    init {
        println("init")
    }

    constructor(name: String, age: Int) : this(name) {
        println("这里是2个参数的次构造")
    }
}

fun main() {
    val teacher = Teacher2("zhangsan", 20)
}