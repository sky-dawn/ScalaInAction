package com.lorelib.scala

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
  * @description ArrayOps: 
  * @author listening
  * @create 2017 12 06 下午12:54.
  */

object ArrayOps {
  def main(args: Array[String]): Unit = {
    val array = Array(1, "2", 3, 4, 5)
    for (i <- 0 until array.length) {
      println(array(i))
    }

    for (elem <- array) {
      println(elem)
    }

    for (elem <- array) println(elem)

    val nums = new Array[Int](10)
    val strs = new Array[String](10)
    strs(0) = "Good Bye!"
    for (str <- strs) println(str)

    val b = ArrayBuffer[Int]()
    //b(0) = 1 不可用这种方式，报异常IndexOutOfBoundsException
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array(8, 9, 10)
    printArray(b)

    b.trimEnd(5)
    printArray(b)

    b.insert(2, 18, 19)
    println(b)

    b.remove(2)
    printArray(b)

    b.remove(3, 1)
    printArray(b)

    b.toArray

    // place to worksheet
    val c = Array(2, 4, 5, 2, 8)
    val result = for (elem <- c) yield elem * 2

    for (elem <- c if elem % 2 == 0) yield elem * 2

    c.filter(_ % 2 == 0).map(2 * _)

    Array(1, 2, 4, 5).sum

    println("---------------")
    for (i <- 0 until (c.length, 2)) {
      print(c(i) + "  ")
    }
    println("---------------")

    val m = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
    println(m)
    val m2 = ArrayBuffer("mary", "had", "a", "little", "lamb").max
    println(m2)

    val s = ArrayBuffer(1, 4, 3, 2)
    val sorted = s.sorted
    val s2 = Array(1, 4, 3, 2)
    //s2.sorted
    Sorting.quickSort(s2)
    s2.mkString(" and ")
    s2.mkString("<", ",", ">")

    val matrix = Array.ofDim[Int](3, 4)
    matrix(2)(1) = 42


    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length) {
      triangle(i) = new Array[Int](i + 1)
    }
  }

  def printArray(arr: ArrayBuffer[Int]): Unit = {
    for (elem <- arr) {
      print(elem + "   ")
    }
    println()
  }
}
