package com.example.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileName: FileReadExample
 * Date:   20242024/8/23下午1:59
 * Description:examlple
 * <author> maziyu
 */
public class FileReadExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("/media/ubuntu/mycode/EveryThing/MyEE/src/main/resources/example.txt", "r");

            FileChannel fileChannel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesread = fileChannel.read(buffer);

            while(bytesread != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.println(buffer.get());
                }
                buffer.clear();
                bytesread = fileChannel.read(buffer);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
