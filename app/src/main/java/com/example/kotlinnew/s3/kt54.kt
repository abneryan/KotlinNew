package com.example.kotlinnew.s3

import java.lang.Exception
import java.lang.IllegalArgumentException
import kotlin.math.roundToInt

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 22:04
 * @Description:
 */
/*
    Kotlin takeIf 内置函数
 */
fun main() {
    val checkPermissionAction = checkPermissionAction("Root", "###")
    println(checkPermissionAction)
}

private fun checkPermissionAction(name:String, pwd:String) : String{
    return name.takeIf { permissonSystemServer(name,pwd) }?:"权限不够，被拒绝"
    //name.takeIf(true/false)
    //true：返回name
    //fase:返回null
}
private fun permissonSystemServer(username : String, userpwd: String):Boolean{
    return username == "Root" && userpwd == "###"
}