package com.swrd.lecture.efficiency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static List<Integer> randomList(int num){

        List<Integer> ret = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < num; i++) {
            ret.add(r.nextInt());
        }

        return ret;
    }

    // 从数组中找一个偶数
    public static void Test1() {
        boolean flag = false;

        List<Integer> list = randomList(100);

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2) == 0) {
                flag = true;
            }
        }

        if(flag){
            System.out.println("Found!");
            return;
        }

        System.out.println("Not Found!");
    }

    // Connection pool
    public static void Test2() {
        boolean flag = false;

        List<Integer> list = randomList(100);

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2) == 0) {
                flag = true;
            }
        }

        if(flag){
            System.out.println("Found!");
            return;
        }

        System.out.println("Not Found!");
    }

    public static void main(String[] args) {

    }
}