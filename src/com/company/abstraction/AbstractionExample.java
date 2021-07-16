package com.company.abstraction;

public class AbstractionExample {
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.setEmpId("123");
        emp1.setName("John");
        emp1.setAddress("312, Wallace Street, Glasgow H5 8AH");
        System.out.println(emp1.getCustomerInfo());

    }
}
