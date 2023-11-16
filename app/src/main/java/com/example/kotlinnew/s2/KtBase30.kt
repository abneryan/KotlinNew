package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
   Kotlin 的内联inline
   某个函数含有Lambda的时候使用
   如果某个使用lambda的函数没有使用内联，会生成多个对象来完成Lambda的调用（会造成内存损耗）
 */
fun main() {
    loginApi("zhangsan", null) { msg, code ->
        println("msg: $msg, code:$code")
    }
}

private inline fun loginApi(name: String, password: String?, response: (String, Int) -> Unit) {
    if (name == null || password == null) {
        response("密码或者用户名不能为空", 400)
    }
}