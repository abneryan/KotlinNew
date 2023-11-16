package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
    默认参数
    Java中解决函数很多参数的方法一般使用建造者设计模式Builder去做
    而kotlin 中可以是用默认参数的方式
 */
fun main() {
    action01("lisi",20)
    action02( "YGQ")

}

private fun action01(name: String, age: Int) {
    println("name:$name   age: $age")
}

private fun action02(name: String, age: Int = 10) {
    println("name:$name   age: $age")
}