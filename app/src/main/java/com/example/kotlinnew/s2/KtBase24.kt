package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//参数讲解
fun main() {
    // 第一步：函数变量  函数的输入，输出声明
    // 第二步：对声明的实现
    val methodAction : (Int,Int,Int) -> String = {n1,n2,n3->
        "YGQ"
    }
    println(methodAction(1,2,3))
}