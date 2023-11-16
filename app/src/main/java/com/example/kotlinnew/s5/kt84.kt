package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//智能类型转换

/*
   public final class Person
   open 去除final修饰
 */
open class Person3(private val name: String) {
    fun methodPerson() = println("我是父类的方法")
}

class Student3(private val subName: String) : Person3(subName) {
    fun methodStudent() = println("我是子类的方法")
}

fun main() {
    val person : Person3 = Student3("张三")
    person.methodPerson()
    //智能类型转换
    person as Student3
    person.methodPerson()
    person.methodStudent()
}