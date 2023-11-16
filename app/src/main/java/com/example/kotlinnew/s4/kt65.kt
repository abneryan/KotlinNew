package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Map类型
fun main() {
    //第一种方式
    val map1 = mapOf<String, Int>("zhangsan" to 10, "lisi" to 12)
    //第二种方式
    val map2 = mapOf<String, Int>(Pair("zhangsan", 10), Pair("lisi", 12))
}