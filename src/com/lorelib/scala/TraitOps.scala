package com.lorelib.scala

/**
  * @description
  * @author listening
  * @date 2017-12-19 13:46
  * @since 1.0
  */
abstract class Logger {
  println("Logger")
  def print
}

trait Logger2 extends Logger {
  println("Logger2")
  override def print = println("hello 2")
}

trait Logger3 extends Logger {
  println("Logger3")
  override def print = println("hello 3")
}

trait Logger4 extends Logger {
  println("Logger4")
  override def print = println("hello 4")
}

class Demo extends Logger with Logger3 with Logger2 {
  def hello = print
}

/**
  * 1. 构造函数的执行顺序是从左至右;
  *    且对于实例混入的trait构造函数执行顺序仍然是按照类定义中的顺序来，而不是按照实例中混入的顺序执行。
  * 2. trait执行是从右至左，且trait里有相同方法时，这些trait必须继承同一接口，否则报错；
  *    相同方法执行时只执行最右边的方法，如果trait之间还有父子类关系，则执行子类的方法，而不是遵循执行最右边trait方法的原则；
  *    且实例混入的trait都是类中定义的trait，那么执行的顺序按类定义的顺序从右至左；
  * 3. 如果实例混入的trait超出了类中定义的，那么是将类中定义外的trait排列在定义内trait的后面，然后按照构造函数或trait方法
  *    的规则进行顺序执行。
  */
object TraitOps {
  def main(args: Array[String]): Unit = {
    val demo = new Demo
    demo.hello

    println("----------------")

    val demo2 = new Demo() with Logger2 with Logger3
    demo2.hello

    val demo3 = new Demo() with Logger4 with Logger3
    demo3.hello
  }
}
