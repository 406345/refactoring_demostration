package com.swrd.lecture.replace_switch_with_strategy;

public class Origin {


    public enum FeeType{
        Normal,
        Rich,
        Poor
    }
    public double calcPrice(FeeType type, double fee) {

        switch (type) {
            case Normal: {
                return fee;
            }

            case Rich: {
                return fee * 1.2;
            }

            case Poor: {
                return fee * 0.8;
            }

            default: {
                return fee * 1.1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Fee is " + new Origin().calcPrice(FeeType.Rich, 100));
    }

}