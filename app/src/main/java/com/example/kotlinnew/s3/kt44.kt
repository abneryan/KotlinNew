package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin replace 完成加密
fun main() {
    val sourceText = "AAABBBCCC"
    println("原始：$sourceText")
    val newText = sourceText.replace(Regex("[AC]")) {

        when (it.value) {
            "A" -> "1"
            "C" -> "3"
            else -> it.value
        }
    }
    println("加密后：$newText")

    val newSourceText = sourceText.replace(Regex("[1,3]")) {

        when (it.value) {
            "1" -> "A"
            "3" -> "C"
            else -> it.value
        }
    }
    println("解密后：$newSourceText")

}