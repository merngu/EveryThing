package com.learn.principle;

/**
 * FileName: B
 * Date:   20242024/12/25下午10:11
 * Description:
 * <author> maziyu
 */
public class B extends Base{
    public A a = new A();

    public int test(int i,int j){
        return i + j;
    }


    public int f3(int i, int j){
        // this.test(i,j);
        this.a.f1(i,j);
        return i;
    }

}
