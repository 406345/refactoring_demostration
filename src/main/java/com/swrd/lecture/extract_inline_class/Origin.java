package com.swrd.lecture.extract_inline_class;

/**
 * Origin
 */
public class Origin {

    private double memberFactor = 0.8;
    private double memberDeployFee = 2.0;

    public void calcFee(double cost) {
        double fee = cost * memberFactor;
        double finalFee = fee + memberDeployFee;

        System.out.println("Total: " + finalFee);
    }

    public static void main(String[] args) {
        new Origin().calcFee(100.0);
    }
}