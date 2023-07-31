package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {
       
        Test t1 = new Test("Charith", 20, 25350.00);
        
        System.out.println("Name :- " +t1.getName());
        System.out.println("Age :- " +t1.getAge());
        System.out.println("Salary :- " +t1.getSalary());
        
        t1.setName("Vidusha");
        t1.setAge(25);
        t1.setSalary(30000.0);
        
        System.out.println("Name :- " +t1.getName());
        System.out.println("Age :- " +t1.getAge());
        System.out.println("Salary :- " +t1.getSalary());
        
    }
}
