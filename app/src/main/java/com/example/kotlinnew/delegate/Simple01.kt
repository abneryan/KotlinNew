package com.example.kotlinnew.delegate

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/18 22:03
 * @Description:
 */
interface DB {
    fun sava()
}

class SqlDB : DB {
    override fun sava() {
        println("SqlDB---save")
    }
}

class MySqlDB : DB {
    override fun sava() {
        println("MySqlDB---save")
    }
}

class OracleDB : DB {
    override fun sava() {
        println("OracleDB---save")
    }
}

//委托含义解释：将接口的实现委托给参数db
//委托必须是接口
class CreatDBAction(db: DB) : DB by db

fun main() {
    CreatDBAction(SqlDB()).sava()
    CreatDBAction(MySqlDB()).sava()
    CreatDBAction(OracleDB()).sava()
}