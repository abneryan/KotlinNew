package com.example.kotlinnew.s3

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin let安全调用
fun main() {
    //如果name 为null 就不执行?.let{}代码块
    var name: String? = "zhangsan"
    name?.let {

    }
}