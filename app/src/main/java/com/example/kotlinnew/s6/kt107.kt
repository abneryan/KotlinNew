package com.example.kotlinnew.s6

import java.util.Objects

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 19:13
 * @Description:
 */
/*
    Kotlin 的[]
 */
class K107<I>(vararg objects:I, var isR: Boolean = true){
    private val objectsArray :Array<out I> = objects

    fun getR1():Array<out I>? = objectsArray.takeIf { isR }
    fun getR2(index :Int):Any? = objectsArray[index].takeIf { isR }

    operator fun get(index: Int)= objectsArray[index].takeIf { isR }
}

fun main() {
    var k107: K107<String> = K107("A","B","C")
    println(k107[4])
}