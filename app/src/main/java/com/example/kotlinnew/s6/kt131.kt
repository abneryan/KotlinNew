package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 20:45
 * @Description:
 */

/*
    注解 @JvmField
        1,添加@JvmField
             @JvmField
             @NotNull
             public final List names = CollectionsKt.listOf(new String[]{"zhangsan", "lisi"});

        2,不加：
             @NotNull
             private final List names = CollectionsKt.listOf(new String[]{"zhangsan", "lisi"});
 */
class Person {
    val names: List<String> = listOf("zhangsan", "lisi")
}

fun main() {

}