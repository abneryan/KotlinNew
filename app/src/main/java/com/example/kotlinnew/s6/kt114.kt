package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 01:01
 * @Description:
 */
//泛型扩展函数
//如果对泛型进行了扩展函数，那么所有的类型都可以使用该扩展函数

//1.如果是String类型就输出长度

fun <T> T.showContentInfo() {
    println("${if (this is String) "字符串长度：$this.length" else "你不是字符串类型"}")
}
fun main() {
    "zhangsan".showContentInfo()
    false.showContentInfo()
    null.showContentInfo()
}