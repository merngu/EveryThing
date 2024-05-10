package com.example.leet;



/**
 * FileName: Queen2
 * Author: bai
 * Date:   20242024/3/13下午5:16
 * Description:练习2
 * <author> maziyu
 */
public class Queen2 {
    
    int max=8;
    int count=0;

    int juglecount=0;
    public static void main(String[] args) {
        Queen2 queen2 = new Queen2();
        queen2.check(0);
    }

    private void check(int i) {
       if(i==max){
           printAnswer();
           return;
       }

        for (int j = 0; j < max; j++) {
            if(judge()){

            }
        }
    }

    private boolean judge() {


        return true;
    }

    private void printAnswer() {
    }


}
