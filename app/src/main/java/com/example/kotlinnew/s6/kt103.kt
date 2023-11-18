package com.example.kotlinnew.s6

import kotlin.math.abs

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 15:14
 * @Description:
 */
//定义泛型类
class K103<T>(private val isP: Boolean, private var obj: T) {
    fun getObj(): T? = obj.takeIf { isP }
}

data class Student1(var name: String, var age: Int)

fun main() {
    var student = Student1("zhangsan", 20)
    var k103 = K103(false, student)
    //println(k103.getObj())

    //run +?:
//    var result: Any? = K103(false, student).getObj()?.run {
//        println(this)
//    } ?: println("run  返回数据为null")
//    println("result:$result")
    show("a")
    show(null)
}

//泛型函数
fun <B> show(item: B) {
    item?.also {
        println(it)
    }?: println("show()---alse---item is null")
}