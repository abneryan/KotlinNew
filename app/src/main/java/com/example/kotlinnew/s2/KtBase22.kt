package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
    匿名函数
 */
fun main() {
    val count = "zhangsan".count()
    println(count)

    val count1 = "zhangsan".count { char: Char ->
        char == 'n'
    }
    println(count1)

    val count2 = "zhagnsan".count {
        it == 'n'
    }
    println(count2)
}