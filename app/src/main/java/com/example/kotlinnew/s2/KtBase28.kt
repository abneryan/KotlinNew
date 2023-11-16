package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
   函数中定义参数是函数的类型
 */
fun main() {
    loginApi("zhangsan", null) { msg, code ->
        println("msg: $msg, code:$code")
    }
}

private fun loginApi(name: String, password: String?, response: (String, Int) -> Unit) {
    if (name == null || password == null) {
        response("密码或者用户名不能为空", 400)
    }

}