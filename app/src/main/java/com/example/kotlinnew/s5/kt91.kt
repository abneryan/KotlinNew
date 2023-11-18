package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 00:25
 * @Description:
 */
//copy 函数
data class K91(val name: String, var age: Int) {
    var coreInfo: String = ""

    init {
        println("主构造---init")
    }

     constructor(name: String) : this(name, 30) {
        println("次构造")
        coreInfo = "核心技术！！！"
    }

    /*
        默认生成的toString、hashCode、equals、copy等。。。只管主构造函数的参数，次构造函数不管
     */
    override fun toString(): String {
        return "name:$name,age:$age,info:$coreInfo"
    }
}

fun main() {
    val k91 = K91("zhangsan")
    println(k91)
    println()
    var k91Copy = k91.copy("lisi", 20)
    //copy 函数只管主构造函数的参数，次构造不负责
    println("k91Copy:$k91Copy") //输出：k91Copy:name:lisi,age:20,info:
}