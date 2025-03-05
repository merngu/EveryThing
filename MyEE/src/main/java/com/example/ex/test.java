package com.example.ex;

import java.sql.*;
import java.util.*;

/**
 * FileName: test
 * Author: bai
 * Date:   20242024/3/27上午9:48
 * Description:test
 * <author> maziyu
 */
public class test {
    public static void main(String[] args) {
           int n = 321;

           String m = String.valueOf(n);

           int[] oi = new int[m.length()];

        for (int i = m.length() - 1; i >= 0; i--) {
            System.out.println(i);
            System.out.println(m.charAt(i));
        }





//           if( n < 1<<31 && n > Math.pow(2,31) - 1){
//               System.out.println("zero");
//           } else {
//
//           }
    }
}
