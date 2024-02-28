package com.heima.openclose;

public class UserSkin {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        ASkin aSkin = new ASkin();
        souGouInput.setAbstractSkin(aSkin);
        souGouInput.display();
    }
}
