package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 17:55
 * @Description:
 */
//所有类成员都放在类的最前边
class Kt81(name: String) {
    val content: String = getInfo()
    private val name: String = name
    fun getInfo() = name
}

/*
    Exception in thread "main" java.lang.NullPointerException
	    at com.example.kotlinnew.s4.Kt81Kt.main(kt81.kt:17)
	    at com.example.kotlinnew.s4.Kt81Kt.main(kt81.kt)
 */
fun main() {
    val content = Kt81("zhangsan").content
    println("content:${content.length}")
}
        