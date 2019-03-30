package com.revature.Util;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class GradeSubmission {
	public static void countGrades(JavaSparkContext context, SparkSession session, String input, String output) {
		
		//Constructs a schema in the metastore for Spark to load data into and read from
        
//        StructField score = DataTypes.createStructField("Score", DataTypes.DoubleType, true);
//        
//        StructField week = DataTypes.createStructField("Week", DataTypes.DoubleType, true);
//        
//        StructField subject = DataTypes.createStructField("Subject", DataTypes.StringType, true);
//        
//        StructField BatchId = DataTypes.createStructField("Batch_Id", DataTypes.DoubleType, true);
//        
//        StructField TraineeId = DataTypes.createStructField("Trainee_Id", DataTypes.DoubleType, true);
//        
//        StructField TraineeName = DataTypes.createStructField("Trainee_Name", DataTypes.StringType, true);
//        
//        StructField TrainerName = DataTypes.createStructField("Trainer_Name", DataTypes.StringType, true);
//        
//        StructField Batch_Name = DataTypes.createStructField("Batch_Name", DataTypes.StringType, true);
        
        List<StructField> fields = new ArrayList<StructField>();
        
//        fields.add(score);
//        fields.add(week);
//        fields.add(subject);
//        fields.add(BatchId);
//        fields.add(TraineeId);
//        fields.add(TraineeName);
//        fields.add(TrainerName);
//        fields.add(Batch_Name);
        
        StructType schema = DataTypes.createStructType(fields);
		
		Dataset<Row> data = session.sqlContext().read().format("csv").option("delimiter", "~").option("header", "false").schema(schema).load(input);
		
		data.createOrReplaceTempView("GradeSubmission");
        
		
		//Executes SQL query to aggregate data in real-time
		
		Dataset<Row> submittedGrades = session.sqlContext().sql("add query here");

		//Write query results to S3
		submittedGrades.write().format("csv").option("header", "true").save("s3a://revature-analytics-dev/dev1901/GradeSubmission.csv");
	}
}
