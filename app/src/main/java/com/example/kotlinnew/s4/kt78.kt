package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 17:55
 * @Description:
 */
//lateinit 是使用的时候，手动加载的懒加载，然后再使用
//by lazy 是使用的时候，自动加载的懒加载，然后再使用
class K78{
   // val data = readSQLServerDatabaseAction()
    val data1 :String by lazy { readSQLServerDatabaseAction() }
    private fun readSQLServerDatabaseAction():String{
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        println("数据查找中...")
        return "查找数据完成"
    }
}
fun main() {
    //===============下面是不使用 by lazy 的普通方式（饿汉式 没有任何懒加载的特点）
    //还没有真正使用data的时候，readSQLServerDatabaseAction()方法就被调用了。
//    val k78 = K78()
//    Thread.sleep(6000)
//    println("即将开始使用")
//
//    println("最终显示：${k78.data}")


    //===============下面是使用 by lazy 的方式

    val k78 = K78()
    Thread.sleep(6000)
    println("即将开始使用")
    println("最终显示：${k78.data1}")
}