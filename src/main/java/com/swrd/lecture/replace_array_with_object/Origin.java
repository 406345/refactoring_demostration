package com.swrd.lecture.replace_array_with_object;

import java.util.Arrays;
import java.util.List;

/**
 * Origin
 */
public class Origin {

    public void CalcPrice(List<Double> list) {
        System.out.println("Total: " + (list.get(0) * list.get(1) + list.get(2)));
    }

    public static void main(String[] args) {
        List<Double> data = Arrays.asList(100.0, 0.9, 2.0);
        new Origin().CalcPrice(data);
    }
}