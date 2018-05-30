package com.java.learning;

public class StringDemo {
    public static void main(String[] args) {
        // 经典例子（区分==和equals）
        String s1 = "hello world!";
        String s2 = "hello world!";

        String string1 = new String("hello world!");
        String string2 = new String("hello world!");

        // 比较的内存地址
        System.out.println(s1 == s2);
        System.out.println(string1 == string2);
        // 比较的内容
        System.out.println(s1.equals(s2));

        String st = "hello world!";
        // String区分大小写
        System.out.println(st.equals("HELLO WORLD!"));// 不相等
        // 转换大小写
        st.toUpperCase();
        // 忽略大小写
        System.out.println(st.equalsIgnoreCase("hello world!".toUpperCase()));
        // 字符串的拼接
        String sr = "hello".concat("world").concat("!");
        // indexof返回某个字符串第一次出现的位置，索引是从0开始
        System.out.println(sr.indexOf("w"));
        // 提取从位置索引开始的字符串部分(包头不包尾，左闭右开)
        System.out.println(sr.substring(0, 2));// 输出he
        // 返回一个前后不含任何空格的 调用字符串的副本
        System.out.println(" aaa ".trim());// 输出aaa
        // 字符串的拆分
        String aa = "zhangsan,lisi,wangwu,zhaoliu";
        String[] arr = aa.split(",");
        for (String element : arr) {
            System.out.println(element + " ");
        } // 输出zhangsan lisi wangwu zhaoliu
          // StringBuffer：对字符串频繁修改（如字符串连接）时，使用 StringBuffer类可以大大提高程序执行效率
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println(sb.toString());// toString转化为字符串类型输出aaa
        sb.append("bbb").append("ccc").append("ddd").append("eee").append("fff");// 追加字符串
        System.out.println(sb.toString());
        sb.insert(2, "000");// 插入字符串
        System.out.println(sb.toString());

        String str = null;
        // if (str.equals("hello")) {// 此时会出现空指向异常
        // System.out.println("ok");
        // }
        if ("hello".equals(str)) {// 此时equals会处理null值，可以避免空指向异常
            System.out.println("ok");
        }
    }
}
