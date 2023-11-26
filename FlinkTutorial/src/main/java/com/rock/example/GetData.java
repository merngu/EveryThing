package com.rock.example;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;
import java.util.List;

public class GetData {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();

        List<Integer> data = Arrays.asList(1, 2, 3);
        DataStreamSource<Integer> ds = executionEnvironment.fromCollection(data);

        ds.print();
        executionEnvironment.execute();
    }
}
