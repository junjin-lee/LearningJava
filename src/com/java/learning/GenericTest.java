package com.java.learning;

public class GenericTest {

    public static void main(String[] args) {

        Box<String> name = new Box<>("corn");
        Box<Integer> age = new Box<>(1111);

        System.out.println("name class:" + name.getClass());
        System.out.println("age class:" + age.getClass());
        System.out.println(name.getClass() == age.getClass()); // true
        System.out.println("name data :" + name.getData());
    }

}


class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

