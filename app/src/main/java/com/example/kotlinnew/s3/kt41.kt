package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 先决条件函数
fun main() {
    val value = false
    /*
        Exception in thread "main" java.lang.IllegalArgumentException: 你的value是false!!!
	    at com.example.kotlinnew.s3.Kt41Kt.main(kt41.kt:15)
	    at com.example.kotlinnew.s3.Kt41Kt.main(kt41.kt)
     */
    require(value) { "你的value是false!!!" }
}