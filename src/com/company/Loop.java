package com.company;

public class Loop {
    public static void main(String args[])
    {
        System.out.println("Looping Arrays");
        double[] numlist = {121.0, 200.9, 315.21, 50.23};

        //Print all the array elements
        for(int i=0; i < numlist.length; i++){
            System.out.println(""+numlist[i]);
        }

        //Sum of all the elements of an array
        double sum = 0; //initialize sum variable to be 0
        for(int i = 0; i < numlist.length; i++){
            sum = sum + numlist[i];
        }
        System.out.println("Sum :"+sum);

        //Find largest element of an array
        double max = numlist[0];
        for(int i= 1; i < numlist.length; i++){
            if(max < numlist[i])
                max = numlist[i];
        }
        System.out.println("Max:"+ max);


    }

}
