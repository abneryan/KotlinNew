package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//集合转换与快捷函数
fun main() {
    //可变集合
    //含有重复元素
    val list: MutableList<String> = mutableListOf("zhangsan", "lisi", "wangwu","zhangsan ")

    //去重
    var toSet: Set<String> = list.toSet()
    //去重
    val toList = list.toSet().toList()
    //去重
    val distinctList = list.distinct()

}