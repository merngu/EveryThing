package com.heima.qiaojiemoshi;

public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
