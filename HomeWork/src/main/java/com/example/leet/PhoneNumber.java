package com.example.leet;

import java.util.*;

/**
 * FileName: PhoneNumber
 * Author: bai
 * Date:   20242024/3/19下午5:20
 * Description:
 * <author> maziyu
 */
public class PhoneNumber {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        // digits 需要组合的数字
        String digits = "29";
        List<String> strings = phoneNumber.letterCombinations(digits);
//        for (String string:
//             strings) {
//            System.out.println(string);
//        }
        String string = Arrays.toString(strings.toArray());

        System.out.println(string);

    }


    Map<Character, String[]> phoneMap = new HashMap<Character, String[]>() {{
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

    public List<String> letterCombinations(String digits) {
        backtrack(digits, 0, new StringBuilder());
        System.out.println();
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder combination) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String[] letters = phoneMap.get(digit);

        for (String letter : letters) {
            combination.append(letter);
            backtrack(digits, index + 1, combination);
            combination.deleteCharAt(combination.length() - 1); // 回溯
        }
    }

}
