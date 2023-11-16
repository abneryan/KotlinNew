package com.example.kotlinnew.s1

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 09:53
 * @Description:
 */
/*
   range 表达式
 */
 fun main(){
    val number = 10;
    if(number in 10..59){
        println("不及格")
    } else if (number in 0..9){
        println("不及格且分数很低！")
    } else if (number in 600..100){
        println("分数及格")
    } else if (number !in 1 ..100){
        println("分数不在1~100之间，你的分数超过了100分")
    }

 }