package com.heima.moshikuozhan;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone("cpu","三星","king","华为");
        System.out.println(phone);


        PhoneUpdate.Builder mainboard = new PhoneUpdate.Builder()
                .cpu("1")
                .screen("2")
                .memory("3")
                .mainboard("4");

        System.out.println(mainboard);
    }
}
