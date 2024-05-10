package com.example.ex;

import java.io.*;

/**
 * FileName: Try1Test
 * Author: bai
 * Date:   20242024/3/25下午3:14
 * Description:try catch的第一种方法
 * <author> maziyu
 */
public class Try1Test {
    public static void main(String[] args) {
        File file = new File("/media/ubuntu/test.sh");
        InputStream inputStream = null;
        try {
            inputStream  = new FileInputStream(file);
            byte b[] = new byte[1024];
            int len = 0;
            int temp=0;          //所有读取的内容都使用temp接收
            while((temp=inputStream.read())!=-1){    //当没有读取完时，继续读取
                b[len]=(byte)temp;
                len++;
            }
            System.out.println(new String(b,0,len));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
