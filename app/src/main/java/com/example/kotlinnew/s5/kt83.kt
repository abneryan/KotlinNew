package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//类型转换

/*
   public final class Person
   open 去除final修饰
 */
open class Person2(private val name: String) {

    fun showName1() = println("父类名字：$name")
    open fun method(){
        println(showName1())
    }
}

class Student2(private val subName: String) : Person2(subName) {
    fun showName2()= println("子类名字：$subName")
    override fun method() {
        showName2()
    }
}

fun main() {
    val person : Person2 = Student2("张三")
    //person.method()
    //println(person is Person2)
    //println(person is Student2)

    if(person is Person2){
        //(person as Person2).method() //method() 已经被子类重写了，就算是调用了父类，还是会执行子类的方法
        (person as Person2).showName1()
    }
    if(person is Student2){
        (person as Student2).method()
    }
}