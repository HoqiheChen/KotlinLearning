package net.learn.Kotlin

/**
 *@Description
 * @author GeChen
 *@date 2019/5/9 17:24
 */

fun getName():String?{
    return null;
}
fun main(args: Array<String>) {
//    val name = getName()?:return
//    println(name.length)
    val txt:String? = "Hello World"
    println(txt!!.length)
}