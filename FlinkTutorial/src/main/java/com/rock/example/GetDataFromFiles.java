package com.rock.example;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class GetDataFromFiles {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();

        FileSource<String> build = FileSource.forRecordStreamFormat(new TextLineInputFormat(), new Path("/media/ubuntu/mycode/EveryThing/FlinkTutorial/src/main/resources/words.txt")).build();

        executionEnvironment.fromSource(build, WatermarkStrategy.noWatermarks(),"file").print();

        executionEnvironment.execute();

    }
}
