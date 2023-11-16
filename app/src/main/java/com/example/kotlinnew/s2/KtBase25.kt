package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//Kotlin 的it 关键字用途
fun main() {

    val methodAction : (Int,Int,Int) ->String = {n1,n2,n3-> //参数个数大于一个时候不能省略参数，且不会有it
        "YGQ"
    }
    val methodAction1 : (Int) ->String = {//参数个数为1个的时候，可以省略参数，后又默认参数it
        "YGQ--$it"
    }
    println(methodAction1(1))
}