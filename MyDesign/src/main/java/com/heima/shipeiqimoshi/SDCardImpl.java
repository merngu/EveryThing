package com.heima.shipeiqimoshi;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card read a msg :hello word SD";
        return msg;
    }

    @Override
    public void wirteSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
