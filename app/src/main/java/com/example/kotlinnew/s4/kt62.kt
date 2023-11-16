package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Set的创建与元素获取
fun main() {
    //可变集合
    val set: MutableSet<String> = mutableSetOf("zhangsan", "lisi", "wangwu")
    set+="lili"
    set-="lucy"
    //推荐使用此方式，防止越界
    println(set.elementAtOrElse(5){
        "越界了"
    })
}