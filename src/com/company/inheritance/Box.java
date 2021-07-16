package com.company.inheritance;

public class Box {
    //variables
    private int length;
    private int width;

    //constructor
    public Box(int l, int w){
        this.length = l;
        this.width = w;
    }
    //Display box name
    public void displayboxname(){
        System.out.println("I'm parent box");
    }
}
