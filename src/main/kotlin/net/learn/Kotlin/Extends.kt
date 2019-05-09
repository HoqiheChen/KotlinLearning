package net.learn.Kotlin

/**
 *@Description
 * @author GeChen
 *@date 2019/5/9 15:24
 */

open class human (name:String,age:Int) {
    init {
        println("新创建一个${this.javaClass.simpleName}，姓名：$name，年龄：$age")
    }
}
class men(name: String,age: Int):human(name,age)
class women(name: String,age: Int):human(name,age)

fun main(args: Array<String>) {
    val men:men = men("小王",20)
    val women:women = women("小李",21)
}