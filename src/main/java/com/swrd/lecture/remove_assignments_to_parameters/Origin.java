package com.swrd.lecture.remove_assignments_to_parameters;

class Origin {
    public void calcPrice(int count) {
        if (count > 50) {
            count = 50;
        }

        System.out.println("count = " + count * 100.0);
    }

    public static void main(String[] args) {
        new Origin().calcPrice(100);
    }
}