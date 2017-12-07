package com.lorelib.scala

/**
  * @description HelloScala: 
  * @author listening
  * @create 2017 12 06 上午9:32.
  */

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("I love scala")

    val msg = "I love scala"
    println(msg)

    val value = 3
    val result = if (value > 2) 1 else 0
    println(result)

    val a = 1/0
  }
}
