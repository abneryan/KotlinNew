package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//Kotlin的Lambda表达式
//{} 确实是匿名函数，只不过在这个{} 中Lambda表达式的特性越来越多，就改口就做Lambda表达式了
fun main() {
    //(Int) ->Any?
    val fun1 = { n1: Int ->
        val result: Any? = when (n1) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            5->5
            else -> null
        }
    }

}