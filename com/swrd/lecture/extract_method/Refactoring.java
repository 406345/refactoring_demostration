package com.swrd.lecture.extract_method;

public class Refactoring {
    public static void Method1() {
        warming("some warming");
        warming("other warmings");
    }

    public static void warming(String msg) {
        System.out.println("############################");
        System.out.println(msg);
        System.out.println("############################");
    }

    public static void main(String[] args) {
        Method1();
    }
}