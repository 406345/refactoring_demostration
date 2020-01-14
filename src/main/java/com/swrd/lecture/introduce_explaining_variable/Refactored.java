package com.swrd.lecture.introduce_explaining_variable;

public class Refactored {
    private double discount = 0.8;
    private double memberDiscount = 0.8;
    private double itemCount = 100;
    private double itemPrice = 5.0;

    public double getTotalPrice() {
        double totalPrice = itemCount * itemPrice;
        double discountPrice = totalPrice * discount;
        double memberPrice = discountPrice * memberDiscount;

        return memberPrice;
    }

    public static void main(String[] args) {
        System.out.println("The price is " + new Origin().getTotalPrice());
    }
}