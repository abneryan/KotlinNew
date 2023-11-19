package com.example.kotlinnew.delegate

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 22:21
 * @Description:
 */
class Simple02 {
    var floatValue: Float = 3.14f
        set(value) {
            field = value
            println("你设置了floatvalue value:$value")
        }
        get() {
            println("你获取了floatvalue value:$field")
            return field
        }

    //属性委托
    var number: Float by ::floatValue
}

/*
main 函数代码结果输出：
    你设置了floatvalue value:5.0
    你获取了floatvalue value:5.0
    5.0
    你设置了floatvalue value:40.0
    你获取了floatvalue value:40.0
    40.0
 */
fun main() {
    val simple02 = Simple02()
    //println(simple02.number)
    simple02.number = 5f //给number赋值（用户在赋值number调用setNumber--->实例--->setFloatValue）
    println(simple02.number)//读取number（用户读取number 调用 getNumber--->实例--->getFloatValue）
    simple02.floatValue =40f //修改委托对象中的数值，也会更新被委托的数值
    println(simple02.number)
}
