package com.swrd.lecture.introduce_explaining_variable;

public class Origin {
    private double discount = 0.8;
    private double memberDiscount = 0.8;
    private double itemCount = 100;
    private double itemPrice = 5.0;

    public double getTotalPrice() {
        return itemPrice * itemCount * memberDiscount * discount;
    }

    public static void main(String[] args) {
        System.out.println("The price is " + new Origin().getTotalPrice());
    }
}