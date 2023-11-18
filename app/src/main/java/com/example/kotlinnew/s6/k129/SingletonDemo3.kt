package com.example.kotlinnew.s6.k129

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 20:23
 * @Description:
 */
//懒汉式 安全版本
class SingletonDemo3 private constructor(){

    companion object{
        private var singleInstance :SingletonDemo3? = null
            get() {
                if (field == null){
                    field = SingletonDemo3()
                }
                return field
            }
        @Synchronized
        fun getInstanceAction():SingletonDemo3 = singleInstance!!
    }
    fun show() = println("我是单例SingleDemo3的show 方法")
}