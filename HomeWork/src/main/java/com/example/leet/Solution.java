package com.example.leet;

import java.util.List;

/**
 * FileName: Solution
 * Author: bai
 * Date:   20242024/2/28下午5:41
 * Description:电话号码反映字母
 * <author> maziyu
 */
public class Solution {
//    List<String> digits_list;
//    public static List<String> letterCombinations(String digits){
//
//        for (int i = 0; i < digits.length() - 1; i++) {
//            digits_list.add(digits.substring(i));
//        }
//        return null;
//    }

    static String dig = "23";
    public static void main(String[] args) {
        for (int i = 0; i < dig.length(); i++) {
            System.out.println(dig.substring(i,i+1));
        }
    }
}
