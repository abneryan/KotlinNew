package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 初始化init块

class Teacher3(name: String = "王老师") {
    //相当于Java中构造代码块{}
    init {
        println("init---name:$name")
    }


    constructor(name: String, age: Int) : this(name) {
        println("这里是2个参数的次构造 name:$name, age:$age")
    }
    fun method(){
        //println("name：$name")  此处name 不可以使用
    }
}

fun main() {
    val teacher = Teacher3("zhangsan", 20)
}