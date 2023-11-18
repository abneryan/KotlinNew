package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 09:25
 * @Description:
 */

//结构声明

class K92(var name: String, var age: Int) {
    //结构声明
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    var (name: String, age: Int) = K92("zhangsan", 20)
    println("name:$name,age:$age ")
}