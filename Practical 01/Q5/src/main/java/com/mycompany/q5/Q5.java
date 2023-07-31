package com.mycompany.q5;

public class Q5 {

    public static void main(String[] args) {
        
        char grade = 'A';
        switch(grade)
       
        {
            case 'A' :
                System.out.println("Excellent");
            break;
            
            case 'D' :
                System.out.println("You Passed");
            break; 
            
            case 'F' :
                System.out.println("Better try again");
            break;
            
            default :
                System.out.println("Invalid grade");
        }
            
            System.out.println("Your grade is : " +grade);
            
         /*   Output :
                        Excellent
                        Your grade is : A       */
         
        char grade1 ='A';
        switch(grade1)
            
	{
            case 'A' :
                System.out.println("Excellent");
                
            case 'D' :
                System.out.println("You passed");
                
            case 'F' :
                System.out.println("Better try again");
            break;
            
            default :
                System.out.println("Invalid grade");
	}
                
                System.out.println("Your grade is " + grade1);
                
                /* Output :
                            Excellent
                            You passed
                            Better try again
                            Your grade is A     */
                
        char grade2 ='A';
        if(grade2 == 'A')
            
        {
                System.out.println("Excellent");
        }
            else if(grade2 == 'D')
        {
                System.out.println("You passed");
        }
            else if(grade2 == 'F')
        {
                 System.out.println("Better try again");
        }
            else
        {
                System.out.println("Invalid grade");
        }
                System.out.println("Your grade is " + grade2); 
                
          
           /* Output :
                        Excellent
                        Your grade is A
                */     
    }
}
