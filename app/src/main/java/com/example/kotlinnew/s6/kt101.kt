package com.example.kotlinnew.s6

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/17 15:14
 * @Description:
 */
abstract class BaseActivity {
    abstract fun onCreate()
    open fun method() {}
}

class MainActivity : BaseActivity() {
    override fun onCreate() {

    }

    override fun method() {
        super.method()
    }
}