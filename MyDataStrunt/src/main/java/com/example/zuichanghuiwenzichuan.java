package com.example;

/**
 * FileName: zuichanghuiwenzichuan
 * Date:   20242024/12/20下午5:17
 * Description:
 * <author> maziyu
 */
public class zuichanghuiwenzichuan {
    public static void main(String[] args) {
        zuichanghuiwenzichuan z = new zuichanghuiwenzichuan();
        System.out.println(z.longestPalindrome("cabad"));
    }
    public String longestPalindrome(String s) {

        int n = s.length();
        String longest = s.substring(0,1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i,j);
                if (isPalindrome(substring) && substring.length() > longest.length()){
                    longest = substring;
                }
            }
        }
        return longest;
    }









    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
