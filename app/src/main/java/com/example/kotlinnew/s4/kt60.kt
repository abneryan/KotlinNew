package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//结构语法过滤元素
fun main() {
    //可变集合
    val list: List<String> = listOf("zhangsan", "lisi", "wangwu")
    val  (v1:String,v2:String,v3:String) = list

    //用_内部可以不接受赋值，可以节约一些赋值
    //'_' 不是变量，是用来过滤解构赋值的，拒收，不接受赋值给我
    val  (_:String,a2:String,a3:String) = list
}