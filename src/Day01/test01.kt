//@Software: IntelliJ IDEA
// @Project:Kotlin
//@File:test01.java
// @User:彭友聪
//@Date:2019/09/27
// Author:御承扬
//E-mail:2923616405@qq.com


package Day01

import java.lang.Integer.parseInt

fun printSum1(a: Int, b: Int) {
    print(a + b)
}

fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

fun nullTest(args:Array<String>){
    if(args.size < 2) {
        print("Two integers expected")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    if(x != null && y != null){
        print(x + y)
    }
}

fun main(args: Array<String>) {
    printSum1(5, 8)
    print('\n')
    vars(1, 2, 4, 5, 6)
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    print('\n')
    println(sumLambda(12, 14))
    print('\n')
    var a = 1
    val s1 = "a is $a"
    a = 17
    val s2 = "${s1.replace("is","was")}, but now is $a"
    print(s1 + '\n' + s2)
    print('\n')
    nullTest(arrayOf("12","17"))
}

