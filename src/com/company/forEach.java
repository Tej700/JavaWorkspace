package com.company;

public class forEach {
    public static void main(String args[]){
        String[] celeb = {"Taylor Swift", "Bruno Mars", "Max Smith", "Eminem"};
        int[] albums = {22, 20 , 24, 43};
        //for each loop
        for(String name:celeb){
                System.out.print(name);
                System.out.print(",");
        }
        int[] age = {22, 20 , 24, 43};
        for(int x:age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
