package com.example.kotlinnew.s1

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 09:53
 * @Description:
 */
fun main(){
    println("YGQ")

    /*    可读可写      变量名           类型              值
     *      var         name     :     String      =     "YGQ"
     *
     *     可读       变量名            类型               值
     *      val       name     :     String      =     "YGQ"
     *
     * var 声明的变量如果永远不被修改，建议改成val
     * 原则：在开发中尽量使用val,除非是要修改的，才变成var
     */

    //可读可写
    var name :  String  = "YGQ"
    //可读
    val age :  Int  = 10
    name = "zhangsan"
    println(name)
}