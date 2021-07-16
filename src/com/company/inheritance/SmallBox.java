package com.company.inheritance;

public class SmallBox extends Box{
    private int length;
    private int width;

    public SmallBox(int l, int w) {
        super(l, w);
        this.length = l;
        this.width = w;
    }

    //Display box name
    public void displayboxname(){
        System.out.println("I'm small box");
    }

    //Display Area
    public void displayArea(){
        double area = length * width;
        System.out.println("Area is "+ area);
    }
}
