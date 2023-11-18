package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 09:35
 * @Description:
 */
//运算符重载

class AddClass(var n1: Int, var n2: Int) {
    //运算符重载
//    operator fun plus(p1: AddClass) = n1 + p1.n1 + n2 + p1.n2

    operator fun plus(p1: AddClass) = AddClass(n1 + p1.n1, n2 + p1.n2)
}

fun main() {
    var addClass = AddClass(1, 2)
    var addClass1 = AddClass(3, 4)
    println(addClass.plus(addClass1).n1)
}