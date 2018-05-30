package com.java.learning;

public class MathDemo {
    public static void main(String[] args) {
        // 定义一个double类型的变量
        double a = 12.08;
        // 将double类型强制转换 int类型，去掉小数位
        int b = (int) a;
        System.out.println("强制转换为：" + b);
        // 调用round方法，进四舍五入
        Long c = Math.round(a);
        System.out.println("返回四舍五入的整数：" + c);
        // 调用floor方法，小于参数的最大
        double d = Math.floor(a);
        System.out.println("返回小于参数的最大整数：" + d);
        // 调用ceil方法，大于参数的最小
        double e = Math.ceil(a);
        System.out.println("返回大于参数的最小整数：" + e);
        // 调用random方法，随机数[0，1）之间的 随机浮点数
        double f = Math.random();
        System.out.println("随机数：" + f);
        // 调用random方法，随机[0，99）之间的整数
        int g = (int) (Math.random() * 99);
        System.out.println("返回[0，99）之间的随机整数：" + g);
    }
}
