package com.example.kotlinnew.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 23:07
 * @Description:
 */
/*
   自定义委托
*/
class Owner {
    /*
        var 自定义委托中必须有get set 方法
        String 自定义委托中，get返回String ,set传入String
        get/set方法 第一个参数必须是包含本类Owner或者Owner的父类
     */
    var text: String by Simple04()

    var text1: String by StringDelegate()
}


//第一种方式
class Simple04 {
    private var str: String = "Default"
    operator fun getValue(owner: Owner, property: KProperty<*>): String {
        println("getValue")
        return str
    }

    operator fun setValue(owner: Owner, property: KProperty<*>, value: String) {
        println("setValue：$value")
        str = value
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//第二种方式ReadWritePropertyb
class StringDelegate() : ReadWriteProperty<Owner, String> {
    private var str: String = "Default"
    override fun getValue(thisRef: Owner, property: KProperty<*>): String {
        println("StringDelegate---getValue")
        return str
    }

    override fun setValue(thisRef: Owner, property: KProperty<*>, value: String) {
        println("StringDelegate---setValue：$value , property:$property ")
        str = value
    }

}

fun main() {
    var owner = Owner()
    owner.text = "张三"

    var owner1 = Owner()
    owner1.text1 = "李四"
}
