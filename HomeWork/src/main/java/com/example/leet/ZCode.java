package com.example.leet;

/**
 * FileName: ZCode
 * Date:   20252025/2/27下午4:22
 * Description:z字形变换
 * <author> maziyu
 */
public class ZCode {


    public static String convert(String s, int numRows) {
       if (numRows == 1){
           return s;
       }
       StringBuilder[] sb = new StringBuilder[numRows];
       for (int i = 0; i < numRows; i++) {
           sb[i] = new StringBuilder();
       }

       int cycleLen = 2 * numRows - 2;
       for (int i = 0; i < s.length(); i++) {
           int index = i % cycleLen; // 在第几行
           int rowIndex = index < numRows ? index : cycleLen - index; // 计算在第几行
           sb[rowIndex].append(s.charAt(i));
       }
       StringBuilder result = new StringBuilder();
        for (StringBuilder sb2 : sb){
            result.append(sb2);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
