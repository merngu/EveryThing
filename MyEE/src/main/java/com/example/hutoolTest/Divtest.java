package com.example.hutoolTest;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;

/**
 * FileName: Divtest
 * Date:   20242024/11/14上午11:25
 * Description:
 * <author> maziyu
 */
public class Divtest {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = null;
        BigDecimal div = NumberUtil.div(a,b);
        System.out.println(div);
    }
}
