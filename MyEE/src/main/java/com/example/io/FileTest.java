package com.example.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/media/ubuntu/mount_disk/mycode/EveryThing/MyEE/src/main/resources/archetype-resources/test.txt");

        File test = new File("/media/ubuntu/mount_disk/mycode/EveryThing/MyEE");

        System.out.println(file.canRead());

        System.out.println("获取绝对路径：" + file.getAbsoluteFile());

        System.out.println("获取路径: " + file.getPath());

        System.out.println("获取指定目录下的所有文件: "  );

        System.out.println("获取名称： " + file.getName());

        System.out.println("获取上层文件目录路径： " + file.getParent());

        System.out.println("获取文件长度" + file.length());

        System.out.println("获取最后一次修改的时间" + file.lastModified());
    }
}