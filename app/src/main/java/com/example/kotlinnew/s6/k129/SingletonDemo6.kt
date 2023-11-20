package com.example.kotlinnew.s6.k129

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 20:23
 * @Description:
 */
//静态内部类方式
class SingletonDemo6 private constructor() {

    private object Holder{
        val INSTANCE = SingletonDemo6()
    }
    companion object{
        val instance = Holder.INSTANCE;
    }
    fun show() = println("我是单例SingleDemo4的show 方法")
}