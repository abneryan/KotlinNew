package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 21:05
 * @Description:
 */
/*
    默认参数
    注解 @JvmOverloads
        java 中就可以直接调用toast("张三")
        原理：编译器环节专门重载一个函数跟java用
             @JvmOverloads
             public static final void toast(@NotNull String name) {
                 toast$default(name, 0, 2, (Object)null);
            }
 */
@JvmOverloads
fun toast(name:String, age:Int = 12){
    println("name:$name, age:$age")
}
