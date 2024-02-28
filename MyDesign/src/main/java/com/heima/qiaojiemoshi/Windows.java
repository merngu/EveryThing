package com.heima.qiaojiemoshi;

public class Windows extends OperatingSystemVersion{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
    videoFile.decode(filename);
    }

}
