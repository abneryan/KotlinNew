package com.example.kotlinnew.delegate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinnew.R
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textView: TextView = findViewById(R.id.tv_view)

        var messag: String by textView
        println("message1:$messag")

        messag = "zhaoshi"
        println("textView:${textView.text}")

        textView.text = "wangwu"
        println("message3:$messag")
        /*
          2023-11-19 10:38:32.148  4551-4551  System.out              com.example.kotlinnew                I  message1:测试
          2023-11-19 10:38:32.149  4551-4551  System.out              com.example.kotlinnew                I  textView:zhaoshi
          2023-11-19 10:38:32.151  4551-4551  System.out              com.example.kotlinnew                I  message3:wangwu
         */
    }

    //通过委托的形式实现DataBingding
    operator fun TextView.provideDelegate(
        thisRef: Any?,
        property: KProperty<*>
    ): ReadWriteProperty<Any?, String> =
        object : ReadWriteProperty<Any?, String> {
            override fun getValue(thisRef: Any?, property: KProperty<*>): String {
                return text.toString()
            }

            override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
                text = value
            }

        }
}
