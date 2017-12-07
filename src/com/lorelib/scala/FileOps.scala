package com.lorelib.scala

import scala.io.Source

/**
  * @description FileOps: 
  * @author listening
  * @create 2017 12 06 下午1:21.
  */

object FileOps {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("src/test.txt")
    for (line <- file.getLines()) {
      println(line)
    }

    val file2 = Source.fromURL("http://spark.apache.org/")
    for (line <- file2.getLines()) println(line)
  }
}
