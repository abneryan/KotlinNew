package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 21:50
 * @Description:
 */
/*
    in T , out T   都是声明处指定关系，声明处泛型
    这个SetClass 里面的所有成员 泛型相关，只能修改、更改 不能获取、读取
 */
class SetClass<in T> {
    fun set1(item: T) {
        println("set1$item")
    }

    //报错：不能给外界读取
    /*fun get(): T? {
        return null
    }*/
}

/*
    in T , out T   都是声明处指定关系，声明处泛型
    这个geClass 里面的所有成员 泛型相关，只能读取，不能修改、更改
 */
class getClass<out T>(_item: T) {
     private val item = _item
    //报错：不能给外界读取
    /*fun set1(item: T) {
        println("set1$item")
    }*/

    //报错：不能给外界读取
    fun get(): T? {
        return item
    }
}

fun main() {

}