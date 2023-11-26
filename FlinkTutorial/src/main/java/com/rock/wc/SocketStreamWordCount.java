package com.rock.wc;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class SocketStreamWordCount {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();

//        DataStreamSource<String> stringDataStreamSource = executionEnvironment.readTextFile("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt");

        DataStreamSource<String> stringDataStreamSource = executionEnvironment.socketTextStream("127.0.0.1", 9999);
        SingleOutputStreamOperator<Tuple2<String, Long>> sum = stringDataStreamSource.flatMap((String s, Collector<Tuple2<String, Long>> collector) -> {

                        String[] strings = s.split(" ");

                        for (String string :
                                strings) {
                            collector.collect(Tuple2.of(string, 1L));
                        }

                }).returns(Types.TUPLE(Types.STRING,Types.LONG))
        .keyBy(data -> data.f0)
                .sum(1);

        sum.print();

        executionEnvironment.execute();
    }
}
