package com.example.linked;

public class BottomNnum {
    public static void main(String[] args) {


    }


    int getTotalnum(HeroNode heroNode){

        int count = 0;
        while (true){
            if (heroNode == null){
                break;
            }

            count++;
        }
        return count;
    }
}
