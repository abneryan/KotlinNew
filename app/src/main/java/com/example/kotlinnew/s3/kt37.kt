package com.example.kotlinnew.s3

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 非空断言操作符
fun main() {
    var name: String? = "zhangsan"
    //无论name 是否为null 都会执行后面的代码
    name!!.length
}