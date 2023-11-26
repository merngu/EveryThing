package com.example.IOexec;

import java.io.File;

public class exc1 {
    public static void main(String[] args) {
        /*
        * 利用File构造器，new 一个文件目录file
        * 1)在其中创建多个文件和目录
        * 2)编写方法，实现删除file中指定文件的操作
        * */

        File file = new File("/media/ubuntu/mount_disk/mycode/EveryThing/MyEE/src/main/resources/archetype-resources");



        printSubFile(file);

        print2(file);

    }

    public static void printSubFile(File dir){
        File[] files = dir.listFiles();


        for (File f :
             files) {
            if (f.isDirectory()){
                printSubFile(f);
            } else {
                System.out.println(f.getAbsoluteFile());
            }
        }
    }


    public static void print2(File dir){
        String[] list = dir.list();

        for (String l:
             list) {
            System.out.println(l);
        }
    }
}
