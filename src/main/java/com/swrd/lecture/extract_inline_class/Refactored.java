package com.swrd.lecture.extract_inline_class;

/**
 * Origin
 */
public class Refactored {

    public class MemberFee{

        public MemberFee(){
            this.discountFactor = 0.8;
            this.deploymentFee = 2;
        }

        public double discountFactor;
        public double deploymentFee;
    }

    private MemberFee mebmerFee = new MemberFee();

    public void calcFee(double cost) {
        double fee = cost * mebmerFee.discountFactor;
        double finalFee = fee + mebmerFee.deploymentFee;

        System.out.println("Total: " + finalFee);
    }

    public static void main(String[] args) {
        new Refactored().calcFee(100.0);
    }
}