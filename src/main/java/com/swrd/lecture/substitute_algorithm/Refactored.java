package com.swrd.lecture.substitute_algorithm;

import java.util.Arrays;
import java.util.List;

class Refactored {

    public double totalPrice = 1000.0;

    public void calcPrice(int memberType) {
        final List<Double> discountFactors = Arrays.asList(1.0,0.9,0.8,0.7,0.6);
        double factor = 1.0;

        if (memberType >= discountFactors.size()) {
            System.out.println("Member type is wrong");
            return;
        }

        factor = discountFactors.get(memberType);

        System.out.println("Total: " + this.totalPrice * factor);
    }

    public static void main(String[] args) {
        new Refactored().calcPrice(2);
    }
}
