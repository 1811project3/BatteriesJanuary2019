package com.revature;

import com.revature.ml.BatterySuccessPredictor;
import org.apache.spark.sql.SparkSession;

/**
 * Hello world!
 */
public class MLDriver {

  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Usage: <spark_master> <input_file> <output_dir>");
      System.exit(1);
    }
    final String master = args[0];
    final String inputPath = args[1];
    final String outputPath = args[2];

    SparkSession spark = SparkSession
        .builder()
        .appName("Battery Analyzer")
        .master(master)
        .getOrCreate();

    new BatterySuccessPredictor().execute(spark, inputPath, outputPath);
  }
}