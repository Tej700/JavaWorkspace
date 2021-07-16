package com.company.inheritance;

public class Employee extends Person {
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
 class InheritanceExample {
    public static void main(String args[]){
        //create person object
        Person person1 = new Person();
        person1.setName("Tae");
        person1.setAge(26);
        System.out.println(String.format("%s's age is %d ",person1.getName(),person1.getAge()));

        //create employee object
        Employee emp1 = new Employee();
        emp1.setName("Namjoon");
        emp1.setAge(28);
        emp1.setSSN("342-234-2134");
        System.out.println(String.format("%s's  with ssn %s age is %d ",emp1.getName(),emp1.getSSN(),emp1.getAge()));
    }
}