package com.example.leet;

/**
 * FileName: ZCode1
 * Date:   20252025/2/28上午11:44
 * Description:leetcode的z字形变换联系1
 * <author> maziyu
 */
public class ZCode1 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        // 根据指定的行数创建StringBuilder数组，将每一行存储在这里
        StringBuilder[] sbs = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        //算出有多少个循环
        int cycle = 2 * numRows - 2;

        //
        for (int i = 0; i < s.length(); i++) {
            int index = i % cycle; // 获取当前循环中所在的位置
            int rowindex = index < numRows ? index : cycle - index;
            sbs[rowindex] = sbs[rowindex].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : sbs) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

}
