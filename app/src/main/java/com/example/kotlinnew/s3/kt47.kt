package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 数字类型的安全转换函数
fun main() {
    val num = "123".toInt()
    println("num:$num")
    //如果转换不成功则返回null
    val num1 :Int? = "123.2".toIntOrNull()
    println("num1:$num1")

}