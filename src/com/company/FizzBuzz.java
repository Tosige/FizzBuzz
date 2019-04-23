package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
	// Fizz Buzz

        int count;

        for (count=1; count<= 100; count++) {

            if (count%3 ==0 && count%5 == 0) {
                System.out.println("FizzBuzz");
            }else if (count%5 ==0){
                System.out.println("Buzz");
            } else if (count%3 ==0 ){
                System.out.println("Fizz");
            }else System.out.println(count);

        }

    }
}
