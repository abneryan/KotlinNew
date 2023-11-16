package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//list 创建与元素获取
fun main() {
    val list: List<String> = listOf("zhangsan", "lisi", "wangwu")
    println(list.get(0))
    println(list[1])
    println(list.getOrNull(3))//如果越界返回null
    println(list.getOrElse(4) {
        "index:$it 越界了"
    })
}