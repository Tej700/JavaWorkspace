package com.company;

public class InstanceMethods {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 30;
        InstanceMethods IObj = new InstanceMethods();
        //IObj.sum(num1, num2);
        System.out.println("Sum:" +IObj.sum(num1, num2));

    }

    public long sum(int num1, int num2){
        long sum = num1 + num2;
        return sum;
    }

}
