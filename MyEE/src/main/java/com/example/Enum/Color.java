package com.example.Enum;

/**
 * FileName: Color
 * Author: bai
 * Date:   20242024/3/29上午10:09
 * Description:颜色
 * <author> maziyu
 */
public enum Color {
    RED("red"),
    YELLOOW("yellow");



    private final String color;
    Color(String color) {
        this.color = color;
    }
}
