package com.swrd.lecture.replace_temp_with_query;

class Refactored {

    private double count = 0.95;
    private double itemPrice = 100.0;
    private double discount = 0.91;

    private double getPrice() {
        return count * itemPrice;
    }

    public double getTotalPrice() {
       
        if (getPrice() > 1000.0) {
            return getPrice() * discount;
        }

        return getPrice();
    }

    public static void main(String[] args) {
        System.out.println("The price is " + new Refactored().getTotalPrice());
    }
}