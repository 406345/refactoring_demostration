package com.swrd.lecture.introduce_foreign_method;

/**
 * Origin
 */
public class Refactored {

    public Refactored() {

    }

    public double deploymentFee;
    public double discountFactor;
    public double cost;

    public Refactored(double deploymentFee, double discountFactor, double baseCost) {

        this.deploymentFee = deploymentFee;
        this.discountFactor = discountFactor;
        this.cost = baseCost;
    }

    public void calcFee() {
        System.out.println("Fee is " + (this.cost * this.discountFactor + this.deploymentFee));
    }

    public static Refactored getRefactored(){
        return  new Refactored(2.0, 0.9, 100);
    }

    public static void main(String[] args) {
        Refactored o = getRefactored();
        o.calcFee();
    }
}