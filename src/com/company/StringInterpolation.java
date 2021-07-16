package com.company;

public class StringInterpolation {
    public static void main(String args[]){
        String custName = "Simon";
        int age =45;
        String city = "Los Angeles";
        String state = "California";
        String country = "USA";
        String zipcode = "90012";

        //No String Interpolation
        System.out.println("Customer details: Name: "+ custName + ", Age: " + age + ", City: " + city +
                ", State: "+ state +", Country: " + country + ", Zipcode: " + zipcode);

        //String Interpolation
        System.out.println(String.format("Customer details:\n Name: %s \n Age: %d \n City: %s \n State: %s \n"  +
                " Country: %s \n Zipcode: %s", custName, age, city, state, country, zipcode));

    }

}
