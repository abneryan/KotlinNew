package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//数组类型
fun main() {
    val intArrayOf: IntArray = intArrayOf(1, 2, 3, 4)
    intArrayOf.elementAtOrElse(4){
        -1
    }
    val objArray : Array<Student> = arrayOf<Student>(Student(),Student())
}
class Student{

}