package com.example.kotlinnew.s4

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 17:55
 * @Description:
 */
//延迟初始化lateinit
class K77{
    lateinit var responseResultInfo : String

    fun loadRequest(){//延时初始化，属于懒加载，用到你的时候你再加载
        responseResultInfo = "加载成功！"
    }
    fun showResponseResult(){
//        由于还没有初始化，还不能使用，否则会报异常
//        if(responseResultInfo == null){
//
//        }
        //直接拿responseResultInfo 字段的isInitialized  （反射）
        if (::responseResultInfo.isInitialized){
            println("responseResultInfo:$responseResultInfo")
        } else{
            println("你还没有初始化加载")
        }
    }
}
fun main() {
    val k77 = K77()
    k77.loadRequest()
    k77.showResponseResult()
}