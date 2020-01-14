package com.swrd.lecture.remove_assignments_to_parameters;

class Refactored {
    public void calcPrice(int count) {
        int itemCount = count;

        if (count > 50) {
            itemCount = 50;
        }

        System.out.println("count = " + itemCount * 100.0);
    }

    public static void main(String[] args) {
        new Origin().calcPrice(100);
    }
}