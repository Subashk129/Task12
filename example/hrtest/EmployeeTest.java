package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee emp = new Employee("Dhoni", 07, 500000);
        
        emp.printName();
        emp.printSalary();
        
    }
    
}
