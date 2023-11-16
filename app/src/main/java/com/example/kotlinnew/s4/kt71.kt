package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//Kotlin 主构造函数

//class Students //主构造函数  此处的() 可以省略

//主构造函数：规范来说，都是增加_xxx 的方式，临时的输入类型，不能直接使用，需要接收下来成为变量才能使用
//_name _age  都是临时变量，不能直接使用，如果需要，则需要转化为val name = _name
class Students(_name: String, _age: Int) {
    var name = _name
        get() = field //get函数不允许私有化private
        set(value) {
            field = value
        }

    val age = _age
        get() = field
        /*set(value) {//val 只读类型不支持set
            field = value
        }*/
}

fun main() {
    val students = Students("zhangsan", 20)
}