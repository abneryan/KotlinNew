package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 17:41
 * @Description:
 */
/*
    Kotlin的泛型类型约束
 */

open class AnyClass(name: String)
open class PersonClass(name: String) : AnyClass(name)
open class StudentClass(name: String) : PersonClass(name)
open class TeacherClass(name: String) : PersonClass(name)

open class CatClass(name: String)

/*
    T:PersonClass  <===> T extends PersonClass
    PersonClass本身与PersonClass的所有子类都可以使用，其他的类，以及父类等都不能兼容此泛型
 */
class K105<T : PersonClass>(private val inputValue: T, private val isR: Boolean = true) {
    fun getObj(): T? {
        return inputValue.takeIf { isR }
    }
}

fun main() {
    var anyClass = AnyClass("AnyClass")
    var personClass = PersonClass("AnyClass")
    var studentClass = StudentClass("StudentClass")
    var teacherClass = TeacherClass("TeacherClass")
    var catClass = CatClass("CatClass")

//    var obj = K105(anyClass).getObj() //异常，类型限定

    var obj1 = K105(personClass).getObj()
    var obj2 = K105(studentClass).getObj()

//    var obj3 = K105(catClass).getObj()

}
