package com.swrd.lecture.split_temporary_variable;

class Origin {

    double discount = 0.95;

    public void getPrice() {
        double price = 100;
        double temp = discount * price;
        System.out.println("The final price is " + temp);
        temp = price * (1 - discount);
        System.out.println("The change is " + temp);
    }

    public static void main(String[] args) {
        new Origin().getPrice();
    }
}