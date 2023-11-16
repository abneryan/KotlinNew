package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//对象表达式

interface RunnableKT{
    fun show()= println("RunnableKT---show()")
}
open class K87{
    open fun method1()= println("method1")
    open fun method2()= println("method2")
}
fun main() {
    //匿名对象表达式
    //object :   ->表示 表达式
    val obj = object : K87() {
        override fun method1() {
            println("obj-method1")
        }

        override fun method2() {
            println("obj-method12")
        }
    }
    obj.method1()

    val runkt = object : RunnableKT {
        override fun show() {
            println("RunnableKT---show")
        }
    }
    runkt.show()

}