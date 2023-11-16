package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 构造初始化顺序

class Teacher4(name: String = "王老师") {//第一步
    //第二步
    var name: String = name

    //第三步
    init {
        println("init---name:$name")
    }

    constructor(name: String, age: Int) : this(name) {
        //第五步
        println("两个参数的构造函数")
    }

    //第四步
    val prop: String = "属性"
}

fun main() {
    val teacher = Teacher4("zhangsan",10)
}