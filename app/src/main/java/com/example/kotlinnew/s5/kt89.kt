package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 23:22
 * @Description:
 */
//Kotlin 嵌套类
class Body(bodyInfo: String){
    var name :String = "身体"
    //内部类
    inner class Heart{
        //内部类调用外部类变量
        fun run()= println("$name +我的小心脏")
    }
}

/*
    嵌套类特点：
        外部类可以访问内部嵌套类
        内部的嵌套类，不能访问外部类成员
 */
class Outer{
    var name :String = "Outer"
    //外部类访问内部嵌套类ok
    fun show(){
        Inner().run()
    }

    //嵌套类
    class Inner{
        fun run()= println("Inner")

        //嵌套类不能访问外部类的变量
        //fun run()= println("Inner 使用 外部类：$name")
    }
}

fun main() {
    //外部类调用内部类的方式
    Body("OK").Heart().run()
    //外部类调用嵌套类
    Outer.Inner().run()
}