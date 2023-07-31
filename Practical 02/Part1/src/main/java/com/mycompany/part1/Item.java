package com.mycompany.part1;

public class Item {
    
    private int location;
    private String description;
    
    public Item(int a, String b){
        location = a;
        description = b;
    }    
    
    public void setLocation(int c){
        location = c;
    }
    
    public int getLocation(){
        return location;
    }
    
    public void setDescription(String d){
        description = d;
    }
        
    public String getDescription(){
        return description;
    } 
}
        
    
    

