package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//可变Map
fun main() {
    val map = mutableMapOf<String, Int>("zhangsan" to 10, "lisi" to 12)
    //getOrPut ： 如果整个map集合里没有这个"lili"元素，先添加lili,23 这个元素，然后再把这个lili元素对应的value23取出来
    println(map.getOrPut("lili"){23})
    println(map)
}