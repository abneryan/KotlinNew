package com.example.kotlinnew.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/19 00:19
 * @Description:
 */
//提供委托：provideDelegate
class Owner05 {
    var aaa: String by SmartDelegate()
    var bbb: String by SmartDelegate()
}

class StringDelegateUpdata(var tag: String) : ReadWriteProperty<Owner05, String> {
    private var str: String = "Defaut"
    override fun getValue(thisRef: Owner05, property: KProperty<*>): String {
        println("StringDelegateUpdata---getValue---tag:$tag")
        println("StringDelegateUpdata---getValue:$str")
        return str
    }

    override fun setValue(thisRef: Owner05, property: KProperty<*>, value: String) {
        println("StringDelegateUpdata---setValue:$value")
        str = value
    }

}

class SmartDelegate {
    //相当于是一个选择器，动态选择，是哪个StringDelegateUpdata自定义委托
    operator fun provideDelegate(
        thisRef: Owner05,
        property: KProperty<*>
    ): ReadWriteProperty<Owner05, String> {
        return if (property.name.contains("aaa")) {
            return StringDelegateUpdata("AAA")
        } else {
            return StringDelegateUpdata("BBB")
        }
    }
}

fun main() {
    var owner05 = Owner05()
    //println(owner05.aaa)
    owner05.aaa = "123"
    println(owner05.aaa)


}