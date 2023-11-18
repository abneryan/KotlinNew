package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 10:45
 * @Description:
 */
//密封类:在于控制子类数量可控，以免被非法继承
//我们的成员类型必须是 object 、class ，并且继承本类 :Exam1()
sealed class Exam1() {
    object LEVEL1 : Exam1()
    object LEVEL2 : Exam1()
    object LEVEL3 : Exam1()
    class LEVEL4(var name:String) : Exam1()
}

class Teacher1(var exam: Exam1) {
    fun show(): String {
        var result = when (exam) {
            is Exam1.LEVEL1 -> "1"
            is Exam1.LEVEL2 -> "2"
            is Exam1.LEVEL3 -> "3"
            is Exam1.LEVEL4 -> "4 --->${(this.exam as Exam1.LEVEL4).name}"
        }
        return result
    }
}

fun main() {
    println(Teacher1(Exam1.LEVEL4("zhangsan")).show())
}