package com.mycompany.q2;

public class Q2 {

    public static void main(String[] args) {
     
        Employee e1 = new Employee(10000);
        
        e1.setEmpName("Bogdan");
        System.out.println("Employee name : " +e1.getEmpName());
        
        e1.setBasicSalary(50000);
        System.out.println("Basic Salary : " +e1.getBasicSalary());
        
        System.out.println("Bouns : " +e1.getBonus());
        
        e1.calculateBonusAmount();
        System.out.println("Bouns Amount : " +e1.getBounsamount());
    }
}
