package com.exaple.bigseven;

public class DependecyInversion2 {
    public static void main(String[] args) {
        //客户端无需改变
        Person2 person2 = new Person2();
        person2.receive(new Email2());
    }
}

class Email2 implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}



interface IReceiver {
    public String getInfo();
}

class Person2{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }

}