package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//匿名函数的类型判定
fun main() {
    //匿名函数：返回值类型自动类型推断为String
    //fun1 = 类型推断返回类型
    val fun1 = { v1: Double, v2: Float, v3: Int ->
        "v1:$v1,v2:$v2,v3:$v3"
    }

    //函数类型的输入与输出： ()-> String
    val fun2 = {
        "YGQ"
    }

    //函数类型的输入与输出： ()-> Unit
    val fun3 = {
    }
    println(fun3)
}