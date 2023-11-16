package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
   Kotlin 的简略写法
 */
fun main() {

    //第一种
//    loginApi("zhangsan", "123456", response = {msg,code->
//        println("msg: $msg, code:$code")
//    })

    loginApi1("zhangsan1", "123", {msg,code-> msg })

    //第二种
//    loginApi("zhangsan","123456",{msg,code ->
//        println("msg: $msg, code:$code")
//    })

    //第三种
    loginApi("zhangsan", null) { msg, code ->
        println("msg: $msg, code:$code")
    }
}

private fun loginApi(name: String, password: String?, response: (String, Int) -> Unit) {
    if (name == null || password == null) {
        response("密码或者用户名不能为空", 400)
    }
}
private fun loginApi1(name: String, password: String?, response: (String, Int) -> String) {
    if (name == null || password == null) {
        response("密码或者用户名不能为空", 400)
    }
}