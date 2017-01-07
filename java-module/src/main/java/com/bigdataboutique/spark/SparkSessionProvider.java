package com.bigdataboutique.spark;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkSessionProvider {

    public final static SparkSession spark = SparkSession.builder().appName("exercise").master("local[4]").getOrCreate();
    public final static JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());

}
