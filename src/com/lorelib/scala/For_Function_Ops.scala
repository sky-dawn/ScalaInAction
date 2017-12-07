package com.lorelib.scala

/**
  * @description For_Function_Ops: 
  * @author listening
  * @create 2017 12 06 下午2:05.
  */

object For_Function_Ops {
  def main(args: Array[String]): Unit = {
    /*for (i <- 1 to 2; j <- 1 to 2) {
      print((100 * i + j) + " ")
    }*/
    for (i <- 1 to 2; j <- 1 to 2 if i != j) print((100 * i + j) + " ")
    println()

    def addA(x: Int) = x + 100
    println(addA(20))

    val add = (x: Int) => x + 200
    println(add(20))

    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    println("The result from a fac is: " + fac(10))

    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    println("The result from a combine is: " + combine("I love Spark"))
    println("The result from a combine is: " + combine("I love Spark", "("))

    def connected(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println("The result from a connected is: " + connected(1, 2, 3))
  }
}
