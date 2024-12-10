package com.example.Enum;

/**
 * FileName: Test
 * Date:   20242024/11/5下午5:36
 * Description:
 * <author> maziyu
 */
public class Test {
    public static void main(String[] args) {
        for (DateTypeEnum value : DateTypeEnum.values()) {
            System.out.println(value + "对应的类型是: " + value.getType());
        }
    }
}
