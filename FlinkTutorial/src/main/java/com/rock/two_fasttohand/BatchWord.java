package com.rock.two_fasttohand;


import org.apache.flink.api.common.functions. ;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.operators.FlatMapOperator;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.runtime.state.Keyed;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * FileName: BatchWord
 * Date:   20252025/2/28下午2:17
 * Description:flink的快速上手
 * <author> maziyu
 */
public class BatchWord {
    public static void main(String[] args) {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> stringDataStreamSource = executionEnvironment.readTextFile("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt");

        stringDataStreamSource.flatMap(new FlatMapFunction<String, Tuple2<String,Long>>() {
            @Override
            public void flatMap(String s, Collector<Tuple2<String, Long>> collector) throws Exception {
                String[] strings = s.split(",");
                for (String ss:
                     strings) {
                    collector.collect(Tuple2.of(ss,1L));
                }
            }

        }).keyBy();

    }
}
