package com.company.inheritance;

public class BIgBox extends Box {
    private int length;
    private int width;
    private int height;

    public BIgBox(int l, int w, int h) {
        super(l, w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    //Display box name
    public void displayboxname(){
        System.out.println("I'm big box");
    }

    //Display Area
    public void displayArea(){
        double area = length * width * height;
        System.out.println("Area is "+ area);
    }
}
