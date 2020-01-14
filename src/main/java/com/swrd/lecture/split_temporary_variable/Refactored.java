package com.swrd.lecture.split_temporary_variable;

class Refactored {

    double discount = 0.95;

    public void getPrice() {
        double price = 100;
        double temp = discount * price;
        System.out.println("The final price is " + temp);
        double delta = price * (1 - discount);
        System.out.println("The change is " + delta);
    }

    public static void main(String[] args) {
        new Refactored().getPrice();
    }
}