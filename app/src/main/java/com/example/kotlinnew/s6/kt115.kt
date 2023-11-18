package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 01:14
 * @Description:
 */
//Kotlin 的标准函数与泛型扩展函数

fun main() {
    var mLet = "zhangsan".mLet {
        true
    }
    println(mLet)

    var mApply = "lisi".mApply {
        "ceshi"
    }
    println(mApply)

}

//对泛型类型进行自定义mLet函数扩展
inline fun <I, O> I.mLet(lambda: (I) -> O): O = lambda(this)

//对泛型类型进行自定义mApply函数扩展
//lambda: I.() -> Unit
// 解析上面表达式： I.() -> Unit  可以理解为：() -> Unit 是I类型 里面的一个匿名扩展
inline fun <I> I.mApply(lambda: I.() -> Unit): I {
    lambda()
    return this
}