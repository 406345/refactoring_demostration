package com.swrd.lecture.replace_switch_with_strategy;

/**
 * Poor
 */
public class Poor extends FeeType {

    @Override
    public double getFactor() {
        return 0.8;
    }
    
}