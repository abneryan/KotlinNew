package com.example.kotlinnew.s1

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 09:53
 * @Description:
 */
/*
   when 表达式

   Java if 是语句  执行语句代码
   Kotlin  if 既是语句又是表达式
   mac: 选中when 表达式，使用快捷键control+shift+p 可以查看when 表达式返回的数据类型是什么
 */
 fun main(){
   val week =10
    val result = when(week){
        1-> "星期一"
        1-> "星期二"
        1-> "星期三"
        1-> "星期四"
        1-> "星期五"
        1-> "星期六"
        1-> "星期日"
        else -> "不知道星期几，蒙圈了！"
    }
    println(result)
 }