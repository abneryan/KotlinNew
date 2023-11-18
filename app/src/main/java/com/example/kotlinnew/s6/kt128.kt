package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 19:27
 * @Description:
 */
/*
    Kotlin 的互操作性与可控性
 */
fun main() {
    //:String!  java 与kotlin 交互的时候，Java给KT用的值都是:String! 这种类型 （平台类型）
//    val info1 = k128().info1
//    val info2 = k128().info2
//    println(info1.length)
//    println(info2.length)

    //推荐使用一下方式
    val info1:String?= k128().info1
    val info2:String? = k128().info2
    println(info1?.length)
    println(info2?.length)


}