package com.bigdataboutique.spark

object HelloWorld extends SparkSessionProvider {

  def main(args: Array[String]): Unit = {
    println("Hello Spark!")
    sc.stop()
  }

}
