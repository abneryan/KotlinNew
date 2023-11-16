package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:43
 * @Description:
 */
//匿名函数与具名函数
fun main() {
    method1("张三"){//匿名函数
        println(it)
    }
    //使用具名函数
    method1("lisi",::labImp)
}


private inline fun method1(name: String, result: (String) -> Unit) {
    if(name !=null){
        result("$name OK")
    }
}
private fun labImp(name:String){
    println("name: $name")
}
