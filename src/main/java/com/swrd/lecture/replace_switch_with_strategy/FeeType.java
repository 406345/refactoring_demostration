package com.swrd.lecture.replace_switch_with_strategy;

class FeeType {
    public double getFactor() {
        return 1.0;
    }

    public double compute(double fee) {
        return fee * this.getFactor();
    }
}