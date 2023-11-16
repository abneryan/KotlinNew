package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//对象声明
//单例

object Kt86 {
    init {
        println("Kt86 init")
    }

    fun show() {
        println("show()")
    }

}
//以上代码等同于Java代码如下：
/*
  public final class Kt86 {
    @NotNull
   public static final Kt86 INSTANCE;

   public final void show() {
      String var1 = "show()";
      System.out.println(var1);
   }

   private Kt86() {
   }

   static {
      Kt86 var0 = new Kt86();
      INSTANCE = var0;
      String var1 = "Kt86 init";
      System.out.println(var1);
   }
}
 */

fun main() {
    Kt86.show()
}