package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//遍历Map
fun main() {
    val map = mapOf<String, Int>("zhangsan" to 10, "lisi" to 12)
    //第一种
    map.forEach{
        println("key:$it.key,value:${it.value}")
    }
    //第二种
    map.forEach{key:String,value:Int ->
        println("key:$key,value:${value}")
    }
    //第三种
    map.forEach{(key:String,value:Int)->
        println("key:$key,value:${value}")
    }
    //第四种
    for (item : Map.Entry<String,Int> in map){
        println("key:$item.key,value:${item.value}")
    }
}