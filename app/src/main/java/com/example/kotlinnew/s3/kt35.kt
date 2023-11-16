package com.example.kotlinnew.s3

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
//Kotlin 安全调用操作符
fun main() {
    //可空
    var name:String? = "zhangsan"
    name= null
    //如果这个name是null，就不会调用？后面的代码，所以就不会奔溃
    name?.length
}