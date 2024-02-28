package com.heima.moshikuozhan;



public class PhoneUpdate {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private PhoneUpdate(Builder builder){

    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {}

        public Builder cpu(String val){
            cpu = val;
            return this;
        }

        public Builder screen(String val){
            screen = val;
            return this;
        }

        public Builder memory(String val){
            memory = val;
            return this;
        }

        public Builder mainboard(String val){
            mainboard = val;
            return this;
        }

        public PhoneUpdate build(){
            return new PhoneUpdate(this);
        }


        @Override
        public String toString() {
            return "Builder{" +
                    "cpu='" + cpu + '\'' +
                    ", screen='" + screen + '\'' +
                    ", memory='" + memory + '\'' +
                    ", mainboard='" + mainboard + '\'' +
                    '}';
        }
    }
}
