package com.example.kotlinnew.s2

/**
 * @Auther: yanguoqing
 * @Date: 2023/11/15 11:35
 * @Description:
 */
//Kotlin函数头
/*
    对应java代码：
    public final class KtBaseKt {
        public static final void main() {
        }

        // $FF: synthetic method
        public static void main(String[] var0) {
             main();
        }

        private static final int method01(int age, String name) {
            return 200;
        }
    }
 */
fun main() {

}

/*
 * 函数默认是public
 * 函数先有输入再有输出
 *
 * 对应java代码：
 *   private static final int method01(int age, String name) {
 *       return 200;
 *   }
 */
private fun method01(age:Int,name:String) : Int{
    return 200
}