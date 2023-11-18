package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 09:35
 * @Description:
 */
//枚举类
data class LimbsInfo(var limbsName:String,var length:Int){
    fun show()= println("limbsName:$limbsName, length:$length")
}

enum class Limbs(private var limbsInfo: LimbsInfo){//主构造

    LEFT_HAND(LimbsInfo("左手",88)),
    RIGHT_HAND(LimbsInfo("右手",88)),
    LEFT_FOOT(LimbsInfo("左脚",140)),
    RIGHT_FOOT(LimbsInfo("右脚",140))

    ;//枚举结束

    //枚举类里定义的函数
    fun show() = "四肢是：${limbsInfo.limbsName}的长度是${limbsInfo.length}"
    //枚举的主构造函数必须和枚举的参数保持一致

    fun updataData(limbsInfoUpdata: LimbsInfo){
        limbsInfo.limbsName = limbsInfoUpdata.limbsName
        limbsInfo.length = limbsInfoUpdata.length
    }
}
fun main() {
    //Limbs 的住构造函数不要管，是枚举负责实例化，参数 然后调用主构造
    println(Limbs.LEFT_FOOT.show())

    //更新枚举信息
    Limbs.LEFT_FOOT.updataData(LimbsInfo("左脚更新", 150))

    println(Limbs.LEFT_FOOT.show())

}