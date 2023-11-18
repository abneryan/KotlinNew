package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 11:54
 * @Description:
 */
/*
    自定义中缀表达式(infix) + 扩展函数 一起使用的时候：1.go("一) == 1 go "一"
    条件：
        1，对第一个参数C1.go  函数扩展
        2，需要在括号（c2：C2）参数里面传递一个参数
 */
private infix fun<C1,C2> C1.go(c2: C2) {
    println("this:$this")
    println("第二个参数c2:$c2")
}

//中缀表达式可以简化代码
fun main() {
    123.go("张三")
    true go "你好"
}