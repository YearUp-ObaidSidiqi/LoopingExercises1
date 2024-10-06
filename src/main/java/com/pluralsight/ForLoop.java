package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int i =0; i < 5; i++){

            System.out.println("I Love Java");
            i++;
            Thread.sleep(1000);


        }
    }
}
