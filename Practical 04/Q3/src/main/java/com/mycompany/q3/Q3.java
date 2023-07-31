package com.mycompany.q3;

public class Q3 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        
        s1.setName("Vidusha");
        s1.setId(29343);
        s1.setCourse("Software Enginnering");
        
        System.out.println("Student Name : " +s1.getName());
        System.out.println("Student ID : " +s1.getId());
        System.out.println("Course Name : \n" +s1.getCourse());
        
        Lecturer l1 = new Lecturer();
        
        l1.setName("Dr. Mohamed Shafraz");
        l1.setId(1111);
        l1.setProgramme("Java OOP");
        
        System.out.println("Lecturer Name : " +l1.getName());
        System.out.println("Lecturer Id : " +l1.getId());
        System.out.println("Lecturer Programme : " +l1.getProgramme());
    }
}
    
  
        
        
    

