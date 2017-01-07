package com.bigdataboutique.spark;

import static com.bigdataboutique.spark.SparkSessionProvider.sc;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Spark!");
        sc.stop();
    }
}
