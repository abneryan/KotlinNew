package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 异常处理与自定义异常特点
fun main() {
    try {
        var name: String? = null
        checkException(name)
        println(name!!.length)

    } catch (e: Exception) {
        println(e.message)
    }
}

private fun checkException(name: String?) {
    name ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的code出现了异常！") {

}