package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin substring
const val TEXT = "AAA BBB"
fun main() {
    val indexOf = TEXT.indexOf('B')
    println(indexOf)
    println(TEXT.substring(0,indexOf))
}