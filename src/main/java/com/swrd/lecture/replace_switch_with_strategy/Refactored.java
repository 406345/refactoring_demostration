package com.swrd.lecture.replace_switch_with_strategy;

public class Refactored {
    public enum FeeTypeEnum {
        Normal, Rich, Poor
    }

    public FeeType getFeeCalculater(FeeTypeEnum type) {

        switch (type) {
        case Normal: {
            return new Normal();
        }

        case Rich: {
            return new Rich();
        }

        case Poor: {
            return new Poor();
        }

        default: {
            return new Normal();
        }
        }
    }

    public static void main(String[] args) {
        FeeType ft = new Refactored().getFeeCalculater(FeeTypeEnum.Rich);
        System.out.println("Fee is " + ft.compute(100));
    }

}