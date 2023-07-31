package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        
        e1.setEmpID(1000);
        e1.setEmpName("Mr.Bogdan");
        e1.setEmpDesignation("No");
        
        System.out.println("Employee ID : " +e1.getEmpID());
        System.out.println("Employee Name : " +e1.getEmpName());
        System.out.println("Employee Designation : " +e1.getEmpDesignation());
        
        
        e1.setEmpID(2000);
        e1.setEmpName("Mr.Bird");
        e1.setEmpDesignation("Yes");
        
        System.out.println("\nEmployee ID : " +e1.getEmpID());
        System.out.println("Employee Name : " +e1.getEmpName());
        System.out.println("Employee Designation : " +e1.getEmpDesignation());
        
        
    }
}
