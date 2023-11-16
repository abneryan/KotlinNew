package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 主构造函数

class Students2(var _name: String, var _age: Int) {

}

fun main() {
    val students = Students2("zhangsan", 20)
    println(students._name)
}