package com.swrd.lecture.inline_method_temp;

public class Origin {
    public static final float factor2 = 0.1f;

    public static float factor() {
        return 0.1f;
    }

    public static float calc_cost(float cost) {
        return cost * factor2 * factor();
    }

    public static void main(String[] args) {
        System.out.println("The cost is " + calc_cost(100.0f));
    }
}