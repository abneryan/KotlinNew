package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException
import kotlin.math.roundToInt

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
/*
    Kotlin apply内置函数
 */
fun main() {
    val str = "123456"
    /*
        str.apply :apply 函数返回"str"本身 ，{} 内部持有this 引用  （this == str）
     */
    val result = str.apply {
        println(this)
    }
}