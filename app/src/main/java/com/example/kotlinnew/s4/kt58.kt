package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//mutator 函数
fun main() {
    //可变集合
    val list: MutableList<String> = mutableListOf("zhangsan", "lisi", "wangwu")
    //mutator +=  -= 操作  原理：运算符重载
    list += "zhaosi"
    list -= "lisi"
    println(list)

    list.removeIf { it.contains("si") } //删除满足条件的元素
    println(list)



}