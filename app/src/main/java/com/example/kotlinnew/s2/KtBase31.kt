package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
   Kotlin 的函数引用
 */
fun main() {
    //1，把匿名函数。给了response变量的 Lambda声明
    loginApi("zhangsan", null) { msg, code ->
        println("msg: $msg, code:$code")
    }
    //把responseImp 实实在在的函数，通过函数引用 " :: "来变成函数类型的变量
    loginApi("zhangsan", null,::responseImp)
}

private fun responseImp(msg:String,code:Int){
    println("responseImp")
}

private inline fun loginApi(name: String, password: String?, response: (String, Int) -> Unit) {
    if (name == null || password == null) {
        response("密码或者用户名不能为空", 400)
    }
}