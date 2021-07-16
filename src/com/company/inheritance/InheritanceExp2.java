package com.company.inheritance;

public class InheritanceExp2 {
    public static void  main(String args[]){
        //CAll box
        Box box1 = new Box(12, 20);
        box1.displayboxname();

        //Call small box
        SmallBox box2 = new SmallBox(4,8);
        box2.displayboxname();
        box2.displayArea();

        //Call big box
        BIgBox box3 = new BIgBox(10,20,30);
        box3.displayboxname();
        box3.displayArea();
    }
}
