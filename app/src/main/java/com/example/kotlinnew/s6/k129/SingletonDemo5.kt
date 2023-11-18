package com.example.kotlinnew.s6.k129

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 20:23
 * @Description:
 */
//懒汉式  双重校验安全
class SingletonDemo5 private constructor() {
    companion object {
        val singleInstance: SingletonDemo5 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingletonDemo5() }
    }
    fun show() = println("我是单例SingleDemo4的show 方法")
}