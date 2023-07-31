package com.mycompany.q1;

public class Test {
    
    private String name;
    private int age;
    private double salary;
    
    public Test(String i, int j, double k){
    
    name = i;
    age = j;
    salary = k;
}
    public void setName(String a){
        name=a;
    }
    public String getName(){
        return name;
    }
    public void setAge(int b){
        age = b;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(double c){
        salary = c;
    }
    public double getSalary(){
        return salary;
    }
}
