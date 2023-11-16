package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//List集合遍历
fun main() {
    //可变集合
    val list: List<String> = listOf("zhangsan", "lisi", "wangwu")

    list.forEach {
        println("item:$it")
    }

    list.forEachIndexed { index, s ->  println("index:$index,s:$s") }
}