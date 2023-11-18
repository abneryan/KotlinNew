package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 15:25
 * @Description:
 */
/*
    手写apply 内置函数
 */
fun main() {
    "zhangsan".mApply1 {
        println("this:$this")
    }
}

//fun INPUT .()  对于INPUT 泛型扩展一个匿名的函数
//fun INPUT.abc() 对泛型INPUT函数扩展  对INPUT泛型扩展一个具名函数abc的函数
private inline fun <INPUT> INPUT.mApply1(lambda: INPUT.() -> Unit): INPUT {
    lambda()
    return this
}
