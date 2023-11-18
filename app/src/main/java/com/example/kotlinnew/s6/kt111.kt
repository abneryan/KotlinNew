package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 23:38
 * @Description:
 */
class Object1
class Object2
class Object3

//reified 真泛型类型的监测
inline fun <reified T> showInfo(item: T) {
    if (Object1() is T) {
        println("Object1")
    } else if (Object2() is T) {
        println("Object2")
    } else if (Object3() is T) {
        println("Object3")
    } else {
        println("T 的真实类型是：${T::class.java.simpleName}")
    }

}

fun main() {
    //>>>>>>>>>>>>>>>>>>>
    show(Object1())
    showInfo("zhangsan")
    showInfo(123)
    /* 上面代码输出：
        com.example.kotlinnew.s6.Object1@12a3a380
        T 的真实类型是：String
        T 的真实类型是：Integer
     */
    //>>>>>>>>>>>>>>>>>>>

    var randomOrDefault:Any? = K111().randomOrDefault { ObjectClass1("zhangsan_1", 10) }
    println(randomOrDefault)
}

data class ObjectClass1(val name: String, var age: Int)
data class ObjectClass2(val name: String, var age: Int)
data class ObjectClass3(val name: String, var age: Int)

class K111 {

    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T? {
        var listOf = listOf<Any>(
            ObjectClass1("zhangsan", 1),
            ObjectClass2("lisi", 2),
            ObjectClass3("wangwu", 3),
        )
        var randomObj: Any? = listOf.shuffled().first()
        println("随机产生的对象：$randomObj")
        return randomObj.takeIf { it is T } as T?
        //如果 it随机产生的对象不等于T 类型，就会走下面的备用环节
            ?: defaultLambdaAction()
    }
}