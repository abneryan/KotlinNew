package com.example.kotlinnew.s6.abner

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 15:08
 * @Description:
 */
/*
    1,扩展文件一般都是public，如果private 则外界无法使用
    2，Iterable<E>父类    这样， 子类set、list 都可以使用,所以用父类
 */

// 本次扩展函数的作用是，随机取第一个元素返回
fun <E> Iterable<E>.randomItemValue(): E = shuffled().first()

//打印随机获取第一个元素
fun <E> Iterable<E>.randomItemValuePrint() = println(shuffled().first())