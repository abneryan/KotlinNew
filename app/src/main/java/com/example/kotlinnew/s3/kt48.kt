package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException
import kotlin.math.roundToInt

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin Double 转换Int
fun main() {
    val num = 123.44444444444.toInt() //取整数部分 123
    val num1 = 123.84444444444.toInt() //取整数部分 123
    val num2 = -123.64444444444.toInt() //取整数部分 -123
    val num3 = 123.54444444444.roundToInt() //四舍五入 124
    println("num:$num,num1:$num1,num2:$num2,num3:$num3")

    println("%.3f".format(66.12345))
}