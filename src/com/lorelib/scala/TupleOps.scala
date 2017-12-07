package com.lorelib.scala

/**
  * @description TupleOps: 
  * @author listening
  * @create 2017 12 06 下午12:51.
  */

object TupleOps {
  def main(args: Array[String]): Unit = {
    val triple = (100, "Scala", "Spark")
    println(triple._1)
    println(triple._3)
  }
}
