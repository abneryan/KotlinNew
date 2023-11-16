package com.example.kotlinnew.s1

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 09:53
 * @Description:
 */
/*
    编译时常量
    编译时常量只能是常用的基本数据类型：（String,Double,Int,Float,Long,Short,Byte,Char,Boolean）
    编译时常量只能在函数外定义，如果在函数内定义，就必须在运行时才能被函数赋值，何来编译时常量只说
    结论：编译时常量只能在函数之外定义，就可以在编译期间初始化了
 */
const val PI = 3.141592653
fun main(){
    println(PI)
}