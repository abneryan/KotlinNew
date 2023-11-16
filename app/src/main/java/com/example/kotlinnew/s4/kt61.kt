package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Set的创建与元素获取
fun main() {
    //不可变集合
    val set: Set<String> = setOf("zhangsan", "lisi", "wangwu")
    println(set.elementAt(1))
    println(set.elementAtOrNull(1))
    //推荐使用此方式，防止越界
    println(set.elementAtOrElse(5){
        "越界了"
    })
}