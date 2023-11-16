package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//函数类型和隐式返回
fun main() {
    //第一步：函数的输入与输出的声明区域
    // 函数类型变量名称     函数输入    函数输出
    val methodAction    :   (Int)    ->   String

    //第二步：上面函数的输入与输出的实现区域
//    methodAction = {
//        "YGQ"//匿名函数不要写return，最后一行作为返回值，背后隐式返回：return "YGQ"
//    }

    //匿名函数
    //此方式是对上面注释第二步的完整写法
    methodAction = { a:Int ->
        "YGQ"
        "YGQ"
        "YGQ"
        "YGQ"
        1
        "YGQ"//最后一行作为返回值
    }

    //第三步：调用此函数
    val methodActionValue = methodAction(1)

    println(methodActionValue)

}