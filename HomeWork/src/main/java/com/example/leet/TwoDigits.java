package com.example.leet;

import java.util.*;

/**
 * FileName: TwoDigits
 * Author: bai
 * Date:   20242024/3/20下午2:56
 * Description:两个电话数字的组合
 * <author> maziyu
 */
public class TwoDigits {
    public static void main(String[] args) {
        TwoDigits twoDigits = new TwoDigits();
        String d = "23";
        List<String> letter = twoDigits.letter(d);

        System.out.println(Arrays.toString(letter.toArray()));

    }

    Map<Character,String[]> phoneMap = new HashMap<Character, String[]>(){{
        put('2', new String[]{"a", "b", "c"});
        put('3', new String[]{"d", "e", "f"});
        put('4', new String[]{"g", "h", "i"});
        put('5', new String[]{"j", "k", "l"});
        put('6', new String[]{"m", "n", "o"});
        put('7', new String[]{"p", "q", "r", "s"});
        put('8', new String[]{"t", "u", "v"});
        put('9', new String[]{"w", "x", "y", "z"});
    }};

    List<String> result = new ArrayList<>();

    public List<String> letter(String digits){
        back(digits,0,new StringBuilder());
        return result;
    }



    public void back(String digits,int index,StringBuilder c){
        if (index == digits.length()){
            result.add(c.toString());
            return;
        }

        char c1 = digits.charAt(index);
        String[] strings = phoneMap.get(c1);

        for (String letter:
             strings) {
            c.append(letter);
            back(digits,index+1,c);
            c.deleteCharAt(c.length() - 1);
        }

    }

}
