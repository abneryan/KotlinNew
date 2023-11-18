package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 10:45
 * @Description:
 */
/*
    数据类使用条件:
        1,服务器请求返回的响应数据JavaBean
        2,数据类至少必须有一个参数主构造函数
        3,数据类型必须有参数，var val 修饰的参数
        4,数据类型不能使用 abstract、open、sealed、inner 等等修饰
        5,需求比较，copy，toString, 结构 等等，这些丰富的功能时候可以使用数据类
 */
data class LoginRequestBean(var info:String){}
data class LoginResponseBean(var msg:String,var code:Int){}

fun main() {
}