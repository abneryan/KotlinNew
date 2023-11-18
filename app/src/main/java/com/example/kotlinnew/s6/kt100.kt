package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 11:25
 * @Description:
 */
//接口定义

/*
    1，接口里面的所有成员和接口本身都是public open的，所以不需要open，这是接口的特殊，接口是开放的
    2，接口不能有主构造
    3，实现接口不仅仅要重写接口函数，还要重写接口的成员
    4，接口实现代码区域，全部都要增加overide关键字来修饰
 */

interface IUSB{
    var usbVersionInfo:String
    fun insertUSB():String
}

//接口实现 方式1
class Mouse(override var usbVersionInfo: String) : IUSB{
    override fun insertUSB(): String {
        return "usbVersionInfo:$usbVersionInfo"
    }
}
//接口实现 方式2
class Mouse1 : IUSB{
    override var usbVersionInfo: String = "mouse"
        get() = field
        set(value) {
            field = value
        }

    override fun insertUSB(): String {
        return "usbVersionInfo:$usbVersionInfo"
    }
}