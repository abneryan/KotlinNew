package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
/*
     函数类型作为返回类型
 */
fun main() {
    val methodAction = methodAction("zhangsan")
    val value = methodAction.invoke("lisi", 20)
    println("value:$value")

}

private fun methodAction(name: String): (String, Int) -> String {
    println("name: $name")
    return { msg, code ->
        "YGQ"
    }
}