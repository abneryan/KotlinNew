package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 16:42
 * @Description:
 */
/*
    变换函数-map
*/

fun main() {
    /*
        T T T-> R R R
        原理：就是把你的匿名函数最后一行的值返回并加入到新的集合里面去，新的集合的泛型是R，
                然后再返回新的集合
     */
    val list: List<String> = listOf("zhangsan", "lisi")
    var map:List<String> = list.map {
        "##$it**"
    }
    map.forEach {
        println(it)
    }
}