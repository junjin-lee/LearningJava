package com.java.learning;

public class GenericMethods {
    // 当方法操作的引用数据类型不确定的时候，可以将泛型定义在方法上
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(99);
        gm.f("test");
        gm.f(new Integer(99));
        gm.f(18.88);
        gm.f('a');
        gm.f(gm);
    }
}
