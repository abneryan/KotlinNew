package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 16:59
 * @Description:
 */
/*
    变换函数-flatMap
    flatMap: 返回类型：每一个元素都对应返回一个集合 集合1 集合2 ...
            是把每一个元素（集合），最后返回新集合List<List<String>> ->最终内部会处理秤
            List<String>的数据结构 (扁平化处理)
 */
fun main() {
    val list: List<String> = listOf("zhangsan", "lisi")
    var flatMap = list.map {
        "你的姓名是$it"
    }.flatMap {
        listOf("$it 会做饭", "$it 会打游戏")
    }

    /*
        下面代码会输出：
            你的姓名是zhangsan 会做饭
            你的姓名是zhangsan 会打游戏
            你的姓名是lisi 会做饭
            你的姓名是lisi 会打游戏
     */
    flatMap.forEach {
        println(it)
    }
}