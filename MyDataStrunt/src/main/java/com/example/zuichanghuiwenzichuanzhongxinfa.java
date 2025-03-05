package com.example;

/**
 * FileName: zuichanghuiwenzichuanzhongxinfa
 * Date:   20242024/12/23下午2:56
 * Description:
 * <author> maziyu
 */
public class zuichanghuiwenzichuanzhongxinfa {
    public static void main(String[] args) {
        String s = "babad";
        zuichanghuiwenzichuanzhongxinfa z = new zuichanghuiwenzichuanzhongxinfa();
        String s1 = z.longestPalindrome(s);
        System.out.println(s1);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0){
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 以单字符为中心扩展
            int len1 = expandAroundCenter(s, i, i);
            // 以相邻两个字符为中心扩展
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
