package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 10:45
 * @Description:
 */

//枚举类：在于控制状态数量可控
enum class Exam {
    LEVEL1,
    LEVEL2,
    LEVEL3,
    LEVEL4,
    ;
}

class Teacher(var exam: Exam) {
    fun show(): String {
        var result = when (exam) {
            Exam.LEVEL1 -> "1"
            Exam.LEVEL2 -> "2"
            Exam.LEVEL3 -> "3"
            Exam.LEVEL4 -> "4"
        }
        return result
    }
}

fun main() {
    println(Teacher(Exam.LEVEL4).show())
}