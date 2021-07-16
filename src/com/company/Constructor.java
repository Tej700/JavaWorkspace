package com.company;

public class Constructor {

    public  Constructor(){
        System.out.println("I'm a default constructor");
    }
    public  Constructor(String str){
        System.out.println("I'm a parametrized constructor");
        System.out.println(str);
    }
    public static void main(String args[]){
        String str = "I'm a string";
        System.out.println("Testing constructors");
        //String str2 = new String("Hi String Object");
        //System.out.println(str2);
       //System.out.println(new Constructor());
        Constructor con1 = new Constructor();
        Constructor con2 = new Constructor(str);
    }
}
