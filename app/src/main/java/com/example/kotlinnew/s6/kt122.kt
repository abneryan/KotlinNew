package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 16:17
 * @Description:
 */
/*
    DSL Domain-specific language，缩写：DSL。领域专用语言
 */
class Context{
    val name:String = "zhangsan"
    val info:String = "我是张三"
    fun toast(str:String) :Unit = println("toast:$str")
}

inline fun Context.apply5(lambda : Context.(String)->Unit) :Context{
    lambda(info)
    return this
}

/*
   其实apply5 函数就是DSL编程范式，定义输入输出等规则：
        1，定义整个lambda规范标准，输入必须是Context这个类，才有资格调用apply5这个函数，
            匿名函数里面持有this == Context 调用者本身 ，it ==String
        2, 定义整个lambda规则标准，输出， 我们会始终返回Context 本身，所以可以链式调用
            然后main函数就是可以根据，DSL编程范式标准规则，来写具体的实现，这就是DSL编程范式
 */
fun main() {
    Context().apply5 {
        println("输入规则：我的it 是：$it,我的this是：$this")
        toast(it) //it ==  val info:String = "我是张三"
        toast(name) //val name:String = "zhangsan"
        true
        123
    }.apply5 {

    }
}