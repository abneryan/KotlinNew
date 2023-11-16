package com.example.kotlinnew.s3

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 空合并操作符 ?:
//空合并操作符 xxx ?: "原来你是null"        如果xxx为null 则执行?:后面的代码
fun main() {
    var name: String? = "zhangsan"
    name = null
    println(name ?: "原来你是null")

    println(name?.let { "我的名字是$name" } ?: "原来你也是null!")
}