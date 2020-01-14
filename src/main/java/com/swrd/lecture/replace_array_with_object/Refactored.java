package com.swrd.lecture.replace_array_with_object;

public class Refactored {

    public void CalcPrice(FeeCounter fee) {
        System.out.println("Total: " + (fee.cost * fee.discountFactor + fee.deploymentFee));
    }

    public static void main(String[] args) {
        FeeCounter feeCounter = new FeeCounter();
        feeCounter.cost = 100.0;
        feeCounter.deploymentFee = 2.0;
        feeCounter.discountFactor = 0.9;

        new Refactored().CalcPrice(feeCounter);
    }
}