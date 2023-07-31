package com.mycompany.q4;

public class Q4 {

    public static void main(String[] args) {
        
    int [] numbers = {10, 20, 30, 40, 50};
              
      for(int x : numbers ){
         if( x == 30 ){
	    break; 
        }
            System.out.print( x );
            System.out.print("\n");
      }
          System.out.print("I’m  out of the Loop now \n\n");
          
          /* Output:
                    10
                    20
                    I’m  out of the Loop now    */
          
     int [] numbers1 = {10, 20, 30, 40, 50};
     
        for(int x : numbers1 ){
            if( x == 30 ){
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.print("I'm  out of the Loop now");     
                            
        /* Output :
                    10
                    20
                    40
                    50
                    I'm  out of the Loop now    */ 
    }
}     	

   
