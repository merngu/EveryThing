package com.rock.wc;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class StreamWordCount {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> stringDataStreamSource = executionEnvironment.readTextFile("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt");

        SingleOutputStreamOperator<Tuple2<String, Long>> sum = stringDataStreamSource.flatMap(new FlatMapFunction<String, Tuple2<String, Long>>() {
                    @Override
                    public void flatMap(String s, Collector<Tuple2<String, Long>> collector) throws Exception {
                        String[] strings = s.split(",");

                        for (String string :
                                strings) {
                            collector.collect(Tuple2.of(string, 1L));
                        }
                    }
                }).keyBy(data -> data.f0)
                .sum(1);

        sum.print();

        executionEnvironment.execute();
    }
}
