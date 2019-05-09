package net.learn.Kotlin

/**
 *@Description
 * @author GeChen
 *@date 2019/5/9 19:01
 */

fun main(args: Array<String>) {
    val parent:Parent = Parent()
    val sub:Sub? = parent as? Sub
    println(sub)
}