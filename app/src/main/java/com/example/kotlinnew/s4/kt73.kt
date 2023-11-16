package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 次构造函数

class Teacher(name:String){
    //次构造必须调用主构造，否则不通过，主构造统一管理为了更好的初始化设计
    constructor(name: String,age:Int) : this(name){
        println("这里是2个参数的次构造")
    }
}

fun main() {
    //调用顺序：调用次构造函数的时候，先调用主构造，只有主构造调用完之后，再打印次构造里的代码
    val teacher = Teacher("zhangsan",20)
}