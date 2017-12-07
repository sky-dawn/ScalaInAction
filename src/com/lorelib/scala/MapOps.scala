package com.lorelib.scala

/**
  * @description MapOps: 
  * @author listening
  * @create 2017 12 06 下午1:09.
  */

object MapOps {
  def main(args: Array[String]): Unit = {
    val ages = Map("Rocky" -> 27, "Spark" -> 5)
    for ((k, v) <- ages) {
      println("Key is " + k + ", value is " + v)
    }

    for ((k, _) <- ages) println("Key is " + k)
  }
}
