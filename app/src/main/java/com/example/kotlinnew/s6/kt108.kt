package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 20:13
 * @Description:
 */
/*
    总结：
        协变：out 父类 = 子类
        逆变：in 子类  = 父类
 */

//协变：父类泛型声明处 可以接收子类泛型具体处
//生产者 out T   协变[out T 此泛型能够被获取 读取， 所以是out]
interface Producer<out T>{
    fun getT():T
    //fun setT(t:T) //不能更新
}

//消费者 in T   逆变[in T 此泛型能够被修改 更新 插入 修改 所以是in]
interface Consumer<in T>{
    //fun get():T //不能获取
    fun set(t:T)
}

fun main() {
    //out 等价与java中的 ? extends CharSequence
    val list :List<CharSequence> = ArrayList<String>()
}