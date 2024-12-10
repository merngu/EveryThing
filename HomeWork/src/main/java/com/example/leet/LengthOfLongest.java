package com.example.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName: LengthOfLongest
 * Author: bai
 * Date:   20242024/5/13上午10:09
 * Description:无重复的最长字段
 * <author> maziyu
 */
public class LengthOfLongest {

//    public static int leng(String words){
//        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
//        int i = -1,res = 0;
//        for (int j = 0; j < words.length();j++) {
//            if(stringIntegerHashMap.containsKey(words.charAt(j))){
//                i = Math.max(i,stringIntegerHashMap.get(words.charAt(j)));
//
//            }
//            stringIntegerHashMap.put(String.valueOf(words.charAt(j)),j);
//            res = Math.max(res,j - i);
//
//        }
//        return res;
//    }

    // abcabcbb
//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length(), ans = 0;  // n 是 字符串长度  ans最长子字符串长度(子字符串就是该字符串中不重复的字符,例 abcabcbb 其中 abc就是子字符串)
//        Map<Character, Integer> map = new HashMap<>();  // 存储字符的位置
//        for (int end = 0, start = 0; end < n; end++) {
//            char alpha = s.charAt(end); // 获取当前字符
//            if (map.containsKey(alpha)) { // 如果出现的话再进行更新
//                System.out.print("alpha : " + alpha + " ");
//                System.out.println("map.get(alpha) : " + map.get(alpha));
//                start = Math.max(map.get(alpha), start);
//            }
//            ans = Math.max(ans, end - start + 1); // 这个的目的就是做一个窗口,计算子字符串的长度,并取最大值
//            map.put(s.charAt(end), end + 1);  // 更新位置
//        }
//        return ans;
//    }
    public static void long1(String s){
        int answer = 0;
        int start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                start = Math.max(start, map.get(c));
            }

            answer = Math.max(answer, i - start + 1);
            map.put(c, i + 1);
        }
    }

    // start 定义
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        int ans = 0, length = s.length();

        for (int i = 0,start = 0; i < length; i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                start = Math.max(hashMap.get(c),start);
            }
            ans = Math.max(ans,i - start + 1);
            hashMap.put(s.charAt(i),i + 1 ); // 加1的目的???? start 定义的是窗口的开始位置,end是子字符串的结束位置,所以 start + 1
        }
        return ans;

    }

    public static void main(String[] args) {
        String words = "abcabcbb";

//        System.out.println(words.length());
        int leng = lengthOfLongestSubstring(words);

        System.out.println(leng);
    }
}
