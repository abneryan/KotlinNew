package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 21:11
 * @Description:
 */
/*
     注解@JvmStatic
 */
class K133 {
    companion object {
        @JvmField //将name 的访问权限由private -> public
        val name = "zhangsan"

        /*
            使用 @JvmStatic ：会在外部类中创建一个getNameInfo()函数，
            该函数内部会继续调用静态内部类中同为getNameInfo()的函数
         */
        @JvmStatic
        fun getNameInfo() = println("name:$name")
    }
}