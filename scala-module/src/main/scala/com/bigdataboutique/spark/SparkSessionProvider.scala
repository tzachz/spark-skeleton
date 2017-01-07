package com.bigdataboutique.spark

import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

trait SparkSessionProvider {
  lazy val spark: SparkSession = SparkSession.builder.appName("exercise").master("local[4]").getOrCreate
  lazy val sc: SparkContext = spark.sparkContext
}
