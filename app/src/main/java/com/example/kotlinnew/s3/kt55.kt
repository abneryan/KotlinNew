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
    Kotlin takeUnless 内置函数,与takeIf true/false 相反
 */
fun main() {
    val name = ""
    val result = name.takeUnless { it.isNullOrBlank() } ?: "名字为空"
    println("result:$result")
    //name.takeUnless(true/false)
    //true：返回null
    //fase:返回name
}