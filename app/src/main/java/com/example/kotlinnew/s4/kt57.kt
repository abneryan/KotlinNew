package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//可变list
fun main() {
    //可变集合
    val list1: MutableList<String> = mutableListOf("zhangsan", "lisi", "wangwu")
    println(list1.removeAt(0))
    list1.add("赵四")
    list1.remove("zhangsan")

    //不可变集合
    val list2: List<String> = listOf("a", "b")
    //list2.add()  不可变list 不存在add 方法

    //不可变->可变
    val toMutableList = list2.toMutableList()
    toMutableList.add("c")
    println("toMutableList:$toMutableList")

    //可变->不可变
    val toList = list1.toList()

}