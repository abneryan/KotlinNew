package com.example.kotlinnew.s1

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 09:53
 * @Description:
 */
/*
    Kotlin引用类型
    java 语言有两种数据类型
        1，基本数据类型：int double ...
        2, 引用类型    ：Sting Integer ...

   Kotlin 语言只有一种数据类型：
        看起来都是引用数据类型，但实际上编译器会在Java字节码中变换为Java的"基本数据类型"

         public static final void main() {
            int age = true;
            int age1 = true;
            boolean ok = true;
            double pi = 3.141592653;
         }
 */
 fun main(){
    val age : Int= 8
    val age1 : Int?= 9
    val ok : Boolean = true
    val pi : Double = 3.141592653
 }