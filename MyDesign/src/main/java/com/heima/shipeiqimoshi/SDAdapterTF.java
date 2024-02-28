package com.heima.shipeiqimoshi;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void wirteSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
