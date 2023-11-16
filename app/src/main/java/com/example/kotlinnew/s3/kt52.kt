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
    Kotlin with 内置函数
 */
fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4)

    //最后一行作为返回值，内部持有this  (this == list)
    val result = with(list) {
        first() + last()
    }
    println(result)
}