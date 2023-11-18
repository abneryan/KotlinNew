package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 16:45
 * @Description:
 */
//防Rxjava map
//1， 类 isMap  map  takeIf  map是什么类型
class K104<T>(val isMap: Boolean, val inputType: T) {
    //false :返回null
    //true:返回调用这本身R
    inline fun <R> map(mapAction: (T) -> R): R? = mapAction(inputType).takeIf { isMap }
}

inline fun <I, O> map(inputType: I, isMap: Boolean = true, mapAction: (I) -> O): O? {
    return if (isMap) mapAction(inputType) else null
}

fun main() {
//    var k104 = K104(true, 100)
//    //Int->String
//    var result: String? = k104.map {//it : T map的输入（inputType）
//        "[我的it是：$it]"
//    }
//    println("map变换后的是：$result")

    //====================手写Rxjava map 变换函数

    var map = map(10) {
//        "[map变换->我的it是：$it]"
        it.toDouble()
    }
    println("map变换：$map")
}