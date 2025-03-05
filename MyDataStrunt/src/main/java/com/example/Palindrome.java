package com.example;

/**
 * FileName: Palindrome
 * Date:   20242024/12/24下午2:21
 * Description:暴力回文
 * <author> maziyu
 */
public class Palindrome {


    public static String longestPalindrome(String s) {
        int length = s.length();
        String init = s.substring(0, 1);
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > init.length()) {
                    init = substring;
                }
            }
        }
        return init;
    }

    private static boolean isPalindrome(String substring) {
        int left = 0;
        int right = substring.length() - 1;
        while (left < right) {
            if (substring.charAt(left) != substring.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
