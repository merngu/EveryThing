package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.*;

@Service
public class STGeneratorService {

    public static void main(String[] args) {
        STGeneratorService stGeneratorService = new STGeneratorService();

        stGeneratorService.generateConf("test");
    }


    public void generateConf(String table) {

        BufferedReader br = null;
        BufferedWriter bw = null;


        try {
            br = new BufferedReader(new FileReader("/mnt/a9fa8c34-c74f-4630-a351-26c3ce01cd04/mycode/EveryThing/MySpringBoot2/src/main/resources/muban.conf"));

            bw = new BufferedWriter(new FileWriter("new.conf"));

            String str;

            while ((str = br.readLine()) != null) { // 一次读取字符文本文件的一行字符
                bw.write(str); // 一次写入一行字符串
                bw.newLine(); // 写入行分隔符
            }
            bw.flush(); // 刷新缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
// 关闭IO流对象
            try {
                if (bw != null) {
                    bw.close(); // 关闭过滤流时,会自动关闭它所包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
