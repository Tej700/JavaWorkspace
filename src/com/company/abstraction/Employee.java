package com.company.abstraction;

public class Employee extends Customer{
    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public  String getCustomerInfo(){
        return String.format("Customer: %s, EmpId: %s, Address: %s", getName(), getEmpId(), getAddress());
    }
}
