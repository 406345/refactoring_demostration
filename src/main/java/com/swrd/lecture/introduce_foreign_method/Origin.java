package com.swrd.lecture.introduce_foreign_method;

/**
 * Origin
 */
public class Origin {

    public Origin() {

    }

    public double deploymentFee;
    public double discountFactor;
    public double cost;

    public Origin(double deploymentFee, double discountFactor, double baseCost) {

        this.deploymentFee = deploymentFee;
        this.discountFactor = discountFactor;
        this.cost = baseCost;
    }

    public void calcFee() {
        System.out.println("Fee is " + (this.cost * this.discountFactor + this.deploymentFee));
    }

    public static void main(String[] args) {
        Origin o = new Origin(2.0, 0.9, 100);
        o.calcFee();
    }
}