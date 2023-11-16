package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin split
fun main() {
    val jsonText = "1,2,3,4,5"
    val split: List<String> = jsonText.split(',')
    println(split)
    split.forEach {
        println(it)
    }
    //解构
    val (n1: String, n2: String, n3: String, n4: String, n5: String) = split
    println(n1)
}