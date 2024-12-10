package com.example.time;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * FileName: DateTimeExample
 * Date:   20242024/12/2下午3:31
 * Description:
 * <author> maziyu
 */
public class DateTimeExample {
    public static void main(String[] args) {
        // 使用java.util.Date
        Date date = new Date();
        System.out.println("Current Date: " + date);

        // 使用java.time.LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + localDateTime);
    }
}
