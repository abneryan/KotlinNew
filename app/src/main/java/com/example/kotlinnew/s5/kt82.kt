package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//继承与重载的open关键字

/*
   public final class Person
   open 去除final修饰
 */
open class Person(private val name: String) {

    private fun showName() = "父类名字：$name"
    open fun method(){
        println(showName())
    }
}

class Student(private val subName: String) : Person(subName) {
    private fun showName()= "子类名字：$subName"
    override fun method() {
        println(showName())
    }
}

fun main() {
    val person : Person = Student("张三")
    person.method()
}