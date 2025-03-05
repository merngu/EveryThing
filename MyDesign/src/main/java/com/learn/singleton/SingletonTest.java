package com.learn.singleton;

/**
 * FileName: SingletonTest
 * Date:   20242024/12/27下午2:35
 * Description:
 * <author> maziyu
 */
public class SingletonTest {

}

class Singleton {
    private static volatile Singleton singleton;

    public static synchronized Singleton getInstance() {
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
    }


}
