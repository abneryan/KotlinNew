package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 11:39
 * @Description:
 */
/*
    可空类型扩展函数
 */
//此扩展函数只能处理非空类型
//fun String.outputStringValueFun(defautValue: String) = print(this ?: defautValue)


//此扩展函数既能处理非空类型也能处理空类型
//fun String?.outputStringValueFun(defautValue: String) = print(this ?: defautValue)

fun String?.outputStringValueFun(defautValue: String): String = this ?: defautValue
fun main() {
    val inforValue: String? = null
    inforValue.outputStringValueFun("你是null")
}