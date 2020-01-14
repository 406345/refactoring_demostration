package com.swrd.lecture.substitute_algorithm;
 
class Origin {

    public double totalPrice = 1000.0;

    public void calcPrice(int memberType) {

        double factor = 1.0;
        if (memberType == 0) {
            factor = 1.0;
        } else if (memberType == 1) {
            factor = 0.9;
        } else if (memberType == 2) {
            factor = 0.8;
        } else if (memberType == 3) {
            factor = 0.7;
        }

        System.out.println("Total: " + this.totalPrice * factor);
    }

    public static void main(String[] args) {
        new Origin().calcPrice(2);
    }   
}

