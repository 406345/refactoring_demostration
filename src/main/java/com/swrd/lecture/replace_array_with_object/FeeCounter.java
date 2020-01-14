package com.swrd.lecture.replace_array_with_object;

public class FeeCounter {
    public double cost;
    public double discountFactor;
    public double deploymentFee;

    // Better
    public double calc() {
        return this.cost * this.discountFactor + this.deploymentFee;
    }
}