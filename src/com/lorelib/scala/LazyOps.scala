package com.lorelib.scala

import scala.io.Source

/**
  * @description LazyOps: 
  * @author listening
  * @create 2017 12 06 下午2:04.
  */

object LazyOps {
  def main(args: Array[String]): Unit = {
    lazy val file = Source.fromFile("test.txt")
    //for (line <- file.getLines()) println(line)
  }
}
