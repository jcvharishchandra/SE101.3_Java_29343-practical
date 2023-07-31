package com.mycompany.q2;

public class Employee {
    
    private String empName;
    private int basicSalary;
    private int bonus;
    private int bonusAmount;
    
    public void setEmpName(String a){
        empName = a;
    }
    public String getEmpName(){
        return empName;
    }
    public void setBasicSalary(int b){
        basicSalary = b;
    }
    public int getBasicSalary(){
        return basicSalary;
    }
    public Employee(int bon){
        this.bonus = bon;
    }
    public int getBonus(){
        return bonus;
    }
    public void calculateBonusAmount(){
        
        bonusAmount = bonus + basicSalary;
    }
    public int getBounsamount(){
        return bonusAmount;
    }
}

