package 杂项

//杂项
//彭友聪
//2019/6/1
//20:19
//Kotlin
//email:2923616405@qq.com
class Greeter(val name: String) {
    fun greet() {
        println("Hello,$name")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun test() {
    println("Hello World!")
}

fun main(args: Array<String>) {
    Greeter("彭友聪").greet()
    var c: Int = 0
    c = sum(a = 5, b = 8)
    println(c)
    test()
}