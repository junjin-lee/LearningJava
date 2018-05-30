package com.java.learning;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar c = Calendar.getInstance();
        // 获取年
        int year = c.get(Calendar.YEAR);
        // 获取月份，0表示1月份
        int month = c.get(Calendar.MONTH) + 1;
        // 获取日期
        int day = c.get(Calendar.DAY_OF_MONTH);
        // 获取小时
        int hours = c.get(Calendar.HOUR_OF_DAY);
        // 获取分钟
        int minute = c.get(Calendar.MINUTE);
        // 获取秒
        int scond = c.get(Calendar.SECOND);
        // 输出结果
        System.out.println("当前时间为：" + year + "-" + month + "-" + day + " " + hours + ":" + minute + ":" + scond);

    }
}
