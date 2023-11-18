package com.example.kotlinnew.s6
//导入扩展文件
//在工作中非常有用，可以把很多扩展操作写到某一个地方，到时候引用过来，比较独立
import com.example.kotlinnew.s6.abner.randomItemValue as rv  //as rv 重命名扩展操作
import com.example.kotlinnew.s6.abner.randomItemValuePrint as rvp //as rvp 重命名扩展操作

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 11:54
 * @Description:
 */

fun main() {
    var list: List<String> = listOf("zhangsan", "lisi", "wangwu")
    var set: Set<Double> = setOf(1.1, 2.2, 3.3)

    //系统
    println(list.shuffled().first())
    println(set.shuffled().first())

    //自己写的
    println(list.rv())
    list.rvp()
}