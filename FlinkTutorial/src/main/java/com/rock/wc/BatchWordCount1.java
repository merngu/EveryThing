package com.rock.wc;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.stream.Collector;

/**
 * FileName: BatchWordCount1
 * Author: bai
 * Date:   20242024/3/31下午10:41
 * Description:批处理
 * <author> maziyu
 */
public class BatchWordCount1 {
//    public static void main(String[] args) {
//        StreamExecutionEnvironment streamExecutionEnvironment = new StreamExecutionEnvironment();
//
//        DataStreamSource<String> stringDataStreamSource = streamExecutionEnvironment.readTextFile("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt");
//
//        SingleOutputStreamOperator<Object> map = stringDataStreamSource.map(new MapFunction<String, Object>() {
//            @Override
//            public Object map(String value) throws Exception {
//                String[] splits = value.split("");
//                for (String split:
//                     splits) {
//                    Collector.
//                }
//                return split;
//            }
//        });
//
//        map.print();
//    }
}
