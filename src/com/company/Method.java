package com.company;

public class Method {
    public static void main(String agrs[]){
        //call greet method
        greet("John");
        System.out.println(greetMerge("Kai"));
        greet("Tae");

    }
    //Method that greet Stranger
    public static void greet(String name){
        System.out.println("Hello, " + name);
    }

    //Method that does the addition of two integer numbers
    public static  String greetMerge(String name){
        return "Hello " + name + ". welcome to Java class";
    }
}
