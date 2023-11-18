package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 11:06
 * @Description:
 */
/*
    内置函数与扩展属性
 */
fun main() {
    "zhangsan".apply {
        "apply()"
    }
    "zhangsan".also {
        "apply()"
    }
    "zhangsan".run {
        "run this:$this"
        true
    }
    with("zhangsan"){
        true
    }

}

//扩展属性
var String.myInfo: String
    set(value) {myInfo = value}
    get() ="调用者this:$this"
