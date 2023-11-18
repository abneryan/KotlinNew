package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 17:13
 * @Description:
 */
/*
    合并函数-zip
 */
fun main() {
    val namelist: List<String> = listOf("zhangsan", "lisi","wangwu")
    val agelist: List<Int> = listOf(10, 13)
    var zip: List<Pair<String, Int>> = namelist.zip(agelist)
    println(zip)//输出：[(zhangsan, 10), (lisi, 13)]
    var toMap: Map<String, Int> = zip.toMap()
    println(toMap)//输出：{zhangsan=10, lisi=13}

}