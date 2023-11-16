package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 02:13
 * @Description:
 */
//计算属性与防范竞态条件
fun main() {
    val a = A()
    println(a.num)
    println(a.getNameInfo())

}

class A{
    /*
        计算属性   field永远是描述num的值。
        num如果没有赋值，field就不存在了，所以也就没有field。
        下面是这样写get 函数覆盖field内容本身，相当于field失效了，以后用不到了。
        注意：field只适用于非引用型变量
     */

    val num:Int
        get() = (1..1000).shuffled().last() //从1到1000 取出随机值给num


    /*
        防范竞态条件：
            当你调用成员，这个成员可能是null、空 就必须采用防范竞态条件，这个就是KT编程的规范化
            适用方式： ? + 内置函数（apply、also、let、run、with）+ 空合并操作符（?:）
     */
    var name :String?= null
    fun getNameInfo():String{
        return name?.let {
            if(it.isBlank()){
                "1"
            } else {
                "2"
            }
        } ?:"3"
    }
 }