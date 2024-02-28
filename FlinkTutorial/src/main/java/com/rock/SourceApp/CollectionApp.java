package com.rock.SourceApp;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        List<Integer> list = Arrays.asList(1, 22, 3);
        DataStreamSource<Integer> integerDataStreamSource = executionEnvironment.fromCollection(list);
        integerDataStreamSource.print();
        executionEnvironment.execute();
    }
}
