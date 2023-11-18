package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 17:13
 * @Description:
 */
/*
    过滤函数-filter
 */
fun main() {
    val list: List<String> = listOf("zhangsan", "lisi")
    var filter = list.filter {
        it.startsWith("z") //将满足条件的元素加入到集合中，不满足的过滤、舍弃掉
    }
    println(filter)
}