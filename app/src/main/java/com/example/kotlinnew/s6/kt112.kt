package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 00:36
 * @Description:
 */
/*
    扩展函数
    总结：xxx.show   xxx函数里里面持有this == 调用者本身
 */

class K112(var name :String,var age:Int){

}
//show() 是K112类的扩展函数
fun K112.show(){
    println("name:$name")
}
fun String.addExtAction(num:Int):String {
    return this + "$".repeat(num)
}
fun main() {
    var p = K112("zhangsan",10)
    p.show()
    println("YGQ".addExtAction(6))
}