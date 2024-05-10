package com.example.ex;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * FileName: StringWriterTest
 * Author: bai
 * Date:   20242024/3/25下午2:17
 * Description:StringWriter
 * <author> maziyu
 */
public class StringWriterTest {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append('c');
        stringWriter.append('d');

        PrintWriter printWriter = new PrintWriter(stringWriter);


        System.out.println(printWriter);

    }
}
