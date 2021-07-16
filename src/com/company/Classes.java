package com.company;

public class Classes {
    String name;
    String place;
    int id;

    public Classes(String name, String place, int num){
        this.name = name;
        this.place = place;
        this.id = num;
    }

    public Classes() {

    }

    public String getName(){
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getId() {
        return id;
    }

    public void setName(String rm) {
        this.name = rm;
    }

    public void setPlace(String seoul) {
        this.place = seoul;
    }

    public void setId(int i) {
        this.id = i;
    }
}
class MainClass {
    public static void main(String args[]){
        Classes obj1 = new Classes("Tae", "Busan", 7);
        Classes obj = new Classes();
        obj.setName("RM");
        obj.setPlace("Seoul");
        obj.setId(1);
        System.out.println("Obj1:" + obj1);
        System.out.println("Obj:" + obj);

        System.out.println("Name:" + obj.getName());
        System.out.println("Place:" + obj.getPlace());
        System.out.println("Id:" + obj.getId());
        System.out.println("Class Name:" + obj.getClass());

        System.out.println("Name:" + obj1.getName());
        System.out.println("Place:" + obj1.getPlace());
        System.out.println("Id:" + obj1.getId());
        System.out.println("Class Name:" + obj1.getClass());

    }
}