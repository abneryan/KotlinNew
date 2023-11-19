package com.example.kotlinnew.delegate

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 22:52
 * @Description:
 */
fun requestDownLoad(): String {
    println("requestDownLoad。。。")
    Thread.sleep(3000)
    return "下载完成！！！"
}

//懒加载委托 （只有在使用的时候，才会开始加载，这就是懒加载）
val responseData: String by lazy { requestDownLoad() }
fun main() {
    println("准备中。。。")
    Thread.sleep(2000L)
    println("开始请求中。。。")
    println(responseData) //responseData如果没有值，只要在用responseData的时候才会加载，这就是懒加载
    println(responseData) //responseData如果有值了，就直接返回
}