package com.swrd.lecture.consolidate_conditional_expression;

/**
 * Origin
 */
public class Refactored {

    public boolean testValueIfOk(int a) {
        if (a > 100)
            return false;
        if (a < 10)
            return false;
        if (a == 20)
            return false;

        return true;
    }

    public int getValueBySomeRules(int a) {
        if (!testValueIfOk(a))
            return 0;

        // do further processing
        
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Value is " + new Refactored().getValueBySomeRules(30));
    }
}