package com.rock.wc;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.AggregateOperator;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.operators.FlatMapOperator;
import org.apache.flink.api.java.operators.UnsortedGrouping;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class BatchWordCount {


    /**
     * 启动失败原因 文件夹位置有问题
     */

    public static void main(String[] args) throws Exception {

        ExecutionEnvironment executionEnvironment = ExecutionEnvironment.getExecutionEnvironment();

        DataSource<String> stringDataSource = executionEnvironment.readTextFile("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt");

        FlatMapOperator<String, Tuple2<String, Long>> stringTuple2FlatMapOperator = stringDataSource.flatMap(new FlatMapFunction<String, Tuple2<String, Long>>() {
            @Override
            public void flatMap(String line, Collector<Tuple2<String, Long>> collector) throws Exception {
                String[] words = line.split(",");
                for (String word:
                     words) {
                    collector.collect(Tuple2.of(word,1L));
                }
            }
        });

        UnsortedGrouping<Tuple2<String, Long>> tuple2UnsortedGrouping = stringTuple2FlatMapOperator.groupBy(0);

        AggregateOperator<Tuple2<String, Long>> sum = tuple2UnsortedGrouping.sum(1);

        sum.print();
    }

}
