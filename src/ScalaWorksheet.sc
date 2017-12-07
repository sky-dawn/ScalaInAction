import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

println("Hi Scala")

val number = 1

val c = Array(2, 4, 5, 2, 8)
val result = for (elem <- c) yield elem * 2
for (elem <- c if elem % 2 == 0) yield elem * 2
c.filter(_ % 2 == 0).map(2 * _)
Array(1, 2, 4, 5).sum
val m = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
val m2 = ArrayBuffer("mary", "had", "a", "little", "lamb").max
val s = ArrayBuffer(1, 4, 3, 2)
val sorted = s.sorted

val s2 = Array(1, 4, 3, 2)
//s2.sorted
Sorting.quickSort(s2)
s2
s2.mkString(" and ")
s2.mkString("<", ",", ">")

val matrix = Array.ofDim[Double](3, 4)
matrix(2)(1) = 42
matrix
matrix.length

val triangle = new Array[Array[Int]](10)
for (i <- 0 until triangle.length) {
  triangle(i) = new Array[Int](i + 1)
}
triangle