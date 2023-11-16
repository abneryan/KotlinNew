package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//读取Map值
fun main() {
    val map1 = mapOf<String, Int>("zhangsan" to 10, "lisi" to 12)
    //第一种方式
    println(map1["zhangsan"])
    println(map1.get("lisi"))
    //第二种方式
    println(map1.getOrDefault("lisi",-1))
    println(map1.getOrElse("lisi"){-2})
}