package com.company.interfaceexample;

public class Ford implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void cruise() {
        System.out.println("Cruising");
    }
    public static void main (String args[]){
        Ford f120 = new Ford();
        f120.start();
        f120.cruise();
        f120.stop();
    }
}
