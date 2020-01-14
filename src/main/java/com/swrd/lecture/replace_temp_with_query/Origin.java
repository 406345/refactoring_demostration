package com.swrd.lecture.replace_temp_with_query;

class Origin {

    private double count = 0.95;
    private double itemPrice = 100.0;

    public double getTotalPrice() {
        double price = count * itemPrice;

        if (price > 1000.0) {
            return price * 0.95;
        }

        return price;
    }

    public static void main(String[] args) {
        System.out.println("The price is " + new Origin().getTotalPrice());
    }
}