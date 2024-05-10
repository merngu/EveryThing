package com.example.Enum;

/**
 * FileName: Season
 * Author: bai
 * Date:   20242024/3/29上午9:42
 * Description:枚举类测试
 * <author> maziyu
 */
public class Season {
    private final String SEASONNAME;
    private final String SEASONNAMEDESC;

    public Season(String seasonname, String seasonnamedesc) {
        SEASONNAME = seasonname;
        SEASONNAMEDESC = seasonnamedesc;
    }

    public static final Season SUMMNER = new Season("summmer","hot");


}



