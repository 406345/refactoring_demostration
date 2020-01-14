package com.swrd.lecture.consolidate_conditional_expression;

/**
 * Origin
 */
public class Origin {

    public int getValueBySomeRules(int a) {
        if (a > 100)
            return 0;
        if (a < 10)
            return 0;
        if (a == 20)
            return 0;

        return a;
    }

    public static void main(String[] args) {
        System.out.println("Value is "+ new Origin().getValueBySomeRules(30));
    }
}