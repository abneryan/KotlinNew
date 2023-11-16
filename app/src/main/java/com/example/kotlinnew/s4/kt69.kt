package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//定义类与field关键字
fun main() {
    val person = Person()
    person.name  = "lisi"
    println(person.name)

}

class Person{
    var name:String = "zhangsan"
        set(value){
            field = value + "---set"
        }
        get() = field + "---get"
 }