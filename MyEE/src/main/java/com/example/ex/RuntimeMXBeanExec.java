package com.example.ex;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * FileName: RuntimeMXBeanExec
 * Date:   20242024/10/17上午11:16
 * Description:
 * <author> maziyu
 */
public class RuntimeMXBeanExec {
    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String name = runtimeMXBean.getName();
        System.out.println(name);
    }
}
