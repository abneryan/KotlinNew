package com.example.kotlinnew.delegate

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/19 01:03
 * @Description:
 */
/*
    :: 启用官方的委托，不用:: 就需要自定义委托，编译异常
 */
class Simple6{
    //List不可以修改集合
    val data:List<String> by :: _data
    //MutableList  可以修改的集合
    private val _data:MutableList<String> = mutableListOf()
    fun load(){
        _data.add("lisi") // 内部可以修改
    }
}

fun main() {
    var simple6 = Simple6()
//    simple6.data.add("wangwu") // 异常，不可以修改，没有add方法
    println(simple6.data)
}