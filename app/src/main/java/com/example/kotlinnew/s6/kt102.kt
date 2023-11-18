package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 15:14
 * @Description:
 */
//定义泛型类
class K102<T>(var obj:T){
    fun show()= println("obj:$obj")
}
data class Student(var name:String,var age:Int)
fun main() {
    var student = Student("zhangsan", 20)
    var k102 = K102(student)
    k102.show()
}