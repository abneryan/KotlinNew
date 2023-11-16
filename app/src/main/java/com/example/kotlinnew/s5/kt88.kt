package com.example.kotlinnew.s5

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/16 20:39
 * @Description:
 */
//伴生对象的由来：在KT 中没有Java类中的static静态，伴生对象在很大程度上和java 中的static 静态相似

/*
    public final class K88 {
   @NotNull
   private static String name = "张三";
   private static final int age = 10;
   @NotNull
   public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

   @Metadata(
      mv = {1, 9, 0},
      k = 1,
      d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"},
      d2 = {"Lcom/example/kotlinnew/s5/K88$Companion;", "", "()V", "age", "", "getAge", "()I", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "showInfo", "", "app_debug"}
   )
   public static final class Companion {
      @NotNull
      public final String getName() {
         return K88.name;
      }

      public final void setName(@NotNull String var1) {
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         K88.name = var1;
      }

      public final int getAge() {
         return K88.age;
      }

      public final void showInfo() {
         String var1 = "显示name：" + ((Companion)this).getName();
         System.out.println(var1);
      }

      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
 */
class K88{
    companion object{//伴生对象
        var name:String = "张三"
        val age : Int = 10
        fun showInfo()= println("显示name：$name")
    }
}
fun main() {
    val k88 = K88()
    K88.showInfo()
}