package com.mycompany.q1;

public interface MyFirstInterface {
    
    public static final int x = 5;
    
    public abstract void display();
    
    int y = 10;
    
  //   1. In an interface declaring a variable without using public static void keywords will not make any difference.
  //      The interface will automatically takes the variable as public static final.
    
    
    public void display1();
    
 //   2. An interface declaring a method without using abstract keyword will not make any differnce.
 //      The interface will automatically takes the method as a abstract method. 
    
}
