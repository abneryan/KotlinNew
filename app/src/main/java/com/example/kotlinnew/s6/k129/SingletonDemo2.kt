package com.example.kotlinnew.s6.k129

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 20:23
 * @Description:
 */
//懒汉式
class SingletonDemo2 private constructor(){

    companion object{
        private var singleInstance :SingletonDemo2? = null
            get() {
                if (field == null){
                    field = SingletonDemo2()
                }
                return field
            }
        fun getInstanceAction():SingletonDemo2 = singleInstance!!
    }
    fun show() = println("我是单例SingleDemo2的show 方法")
}