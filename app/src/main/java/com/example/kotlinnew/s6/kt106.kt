package com.example.kotlinnew.s6

import java.util.Objects

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 17:41
 * @Description:
 */
/*
    Kotlin 的vararg 关键字 动态参数
 */
class K106<T>(vararg objects: T, var isMap: Boolean = true) {
    //out 我们的T 只能被读取，不能修改，  T 只是读取
    private val objectsArry: Array<out T> = objects
    fun showObj(index: Int): T? {
        return objectsArry[index].takeIf { isMap }
    }
    fun <O> mapObj(index: Int,mapAction:(T ?) -> O?) = mapAction(objectsArry[index].takeIf { isMap })
}

fun main() {
    //由于使用了太多类型的混合真正的类型是：{Comparable<*>? & java.io.Serializable?}
    //可以用Any? 替换
    //var k106: K106<{Comparable<*>? & java.io.Serializable?}>
    var k106: K106<Any?> = K106(1, 2.0, "张三", null, 'C', false, isMap = false)
   // println(k106.showObj(1))

    var mapObj = k106.mapObj(2) {
        "map变换：$it"
    }
    println(mapObj)
}