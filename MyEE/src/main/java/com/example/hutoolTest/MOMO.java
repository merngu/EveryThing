package com.example.hutoolTest;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * FileName: MOMO
 * Date:   20242024/11/22下午2:50
 * Description:
 * <author> maziyu
 */
public class MOMO {
    private static void getWeekOrEndList(String dateType, String startDate, String endDate) {

        DateTime startday = DateUtil.parseDate(startDate);
        DateTime endday = DateUtil.parseDate(endDate);

        List<String> days = new ArrayList<>();

        DateTime now = new DateTime();
        if ("week".equals(dateType)) {
            DateTime endOfWeek = DateUtil.endOfWeek(endday);
            DateTime starOfWeek = DateUtil.endOfWeek(startday);

            // 结束时间的周末小于当前时间
            if (endOfWeek.isBefore(now)) {
                    // 判断开始时间和结束时间是否是同一周 并且结束时间的周末小于当前时间
                    while (!starOfWeek.isAfter(endOfWeek)) {
                        days.add(starOfWeek.toString("yyyy-MM-dd"));
                        starOfWeek = DateUtil.offsetWeek(starOfWeek, 1);
                    }

            } else{
                DateTime endofweek = DateUtil.offsetWeek(endOfWeek, -1);
                    // 判断开始时间和结束时间是否是同一周 并且结束时间的周末小于当前时间
                    while (!starOfWeek.isAfter(endofweek)) {
                        days.add(starOfWeek.toString("yyyy-MM-dd"));
                        starOfWeek = DateUtil.offsetWeek(starOfWeek, 1);
                    }
                }
        }
        if ("month".equals(dateType)) {
            DateTime endOfMonth = DateUtil.endOfMonth(endday);
            DateTime starOfMonth = DateUtil.endOfMonth(startday);

            // 结束时间的周末小于当前时间
            if (endOfMonth.isBefore(now)) {
                // 判断开始时间和结束时间是否是同一周 并且结束时间的周末小于当前时间
                while (!starOfMonth.isAfter(endOfMonth)) {
                    days.add(starOfMonth.toString("yyyy-MM-dd"));
                    starOfMonth = DateUtil.endOfMonth(DateUtil.offsetMonth(starOfMonth, 1));
                }

            } else{
                DateTime endofmonth = DateUtil.endOfMonth(DateUtil.offsetMonth(endOfMonth, -1));
                // 判断开始时间和结束时间是否是同一周 并且结束时间的周末小于当前时间
                while (!starOfMonth.isAfter(endofmonth)) {
                    days.add(starOfMonth.toString("yyyy-MM-dd"));
                    starOfMonth = DateUtil.endOfMonth(DateUtil.offsetMonth(starOfMonth, 1));
                }
            }
        }


        // 打印days集合中的元素
        for (String day : days) {
            System.out.println(day);
        }
    }

    public static void main(String[] args) {


        // 正常的结束时间>结束时间
//        getWeekOrEndList("week", "2024-11-01", "2024-11-07");
//
//        System.out.println("--------------------");
//
//        // 正常的结束时间>结束时间
//        getWeekOrEndList("week", "2024-11-07", "2024-11-07");
//
//
//
//        System.out.println("--------------------");
//
//        // 正常的结束时间>结束时间
//        getWeekOrEndList("week", "2024-11-07", "2024-11-24");

//        System.out.println("---------month-----------");
//
//        // 正常的结束时间>结束时间
//        getWeekOrEndList("month", "2024-09-01", "2024-10-07");
//
//        System.out.println("--------------------");
//
//        // 正常的结束时间>结束时间
//        getWeekOrEndList("month", "2024-09-07", "2024-10-07");
//
//
//
//        System.out.println("--------------------");

        // 正常的结束时间>结束时间
        getWeekOrEndList("month", "2024-09-07", "2024-11-24");


    }

}
