package testrepository2;

public class Star {
    public static void main(String[] args) {
        int rows = 5;
        
        System.out.println("Pattern 1:");
        printPattern1(rows);
        
        System.out.println("\nPattern 2:");
        printPattern2(rows);
        
        System.out.println("\nPattern 3:");
        printPattern3(rows);
        
        System.out.println("\nPattern 4:");
        printPattern4(rows);
        
        System.out.println("\nPattern 5:");
        printPattern5(rows);
        
        System.out.println("\nPattern 6:");
        printPattern6(rows);
        
        System.out.println("\nPattern 7:");
        printPattern7(rows);

        System.out.println("\nPattern 8:");
        printPattern8(rows);
        
        System.out.println("\nPattern 9:");
        printPattern9(rows);
        
        System.out.println("\nPattern 10:");
        printPattern10(rows);
        
        System.out.println("\nPattern 11:");
        printPattern11(rows);

        System.out.println("\nPattern 12:");
        printPattern12(rows);
        
        System.out.println("\nPattern 13:");
        printPattern13(rows);
        
        System.out.println("\nPattern 14:");
        printPattern14(rows);
        
    }
    
    // Method to print pattern 1
    public static void printPattern1(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print pattern 2
    public static void printPattern2(int rows) {
    	for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
       // Method to print pattern 3
    public static void printPattern3(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print pattern 4
    public static void printPattern4(int rows) {
    	for (int i= rows; i>= 1; i--)  
    	{  
    	for (int j=rows; j>i;j--)  
    	{  
    	System.out.print(" ");  
    	}  
    	for (int k=1;k<=i;k++)  
    	{  
    	System.out.print("*");  
    	}  
    	System.out.println("");  
    	}  
    	}  
    
    
 // Method to print pattern 5
    public static void printPattern5(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    // Method to print pattern 6
    public static void printPattern6(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
 // Method to print pattern 7
    public static void printPattern7(int rows) {
    	 for (int i = 0; i <= rows; i++) {
             for (int j = 0; j <= rows - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 0; k <= i; k++) {
                 System.out.print("* ");
             }
             System.out.println();
        }
    	 for (int i = 0; i < rows; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print(" ");
             }
             for (int k = 0; k < rows - i; k++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
    
    // Method to print pattern 8
    public static void printPattern8(int rows) {
    	for (int i= 0; i<= rows-1; i++)  
    	{  
    	for (int j=0; j<=i; j++)   
    	{  
    	System.out.print("*"+ " ");  
    	}   
    	System.out.println("");   
    	}   
    	for (int i=rows-1; i>=0; i--)  
    	{  
    	for(int j=0; j <= i-1;j++)  
    	{  
    	System.out.print("*"+ " ");  
    	}  
    	System.out.println("");  
    	}  
    	} 
    
    // Method to print pattern 9
    public static void printPattern9(int rows) {
    	for (int i= 1; i<= rows ; i++)  
    	{  
    	for (int j=i; j <rows ;j++)              
    	{  
    	System.out.print(" ");  
    	}  
    	for (int k=1; k<=i;k++)   
    	{  
    	System.out.print("*");   
    	}   
    	System.out.println("");   
    	}   
    	for (int i=rows; i>=1; i--)  
    	{  
    	for(int j=i; j<=rows;j++)  
    	{  
    	System.out.print(" ");  
    	}  
    	for(int k=1; k<i ;k++)   
    	{  
    	System.out.print("*");  
    	}  
    	System.out.println("");  
    	}  
    	}  

 // Method to print pattern 10
    public static void printPattern10(int rows) {
    	for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
 
             for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }
    }
 

    
    // Method to print pattern 11
    public static void printPattern11(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // Method to print pattern 12
    public static void printPattern12(int rows) {
    	for (int i = rows; i >= 1; i--) {
    		 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
 
        for (int i = 2; i <= rows; i++) {
 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    // Method to print pattern 13
    public static void printPattern13(int rows) {
    	for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    	for (int i= rows; i>= 1; i--)  
    	{  
    	for (int j=rows; j>i;j--)  
    	{  
    	System.out.print(" ");  
    	}  
    	for (int k=1;k<=i;k++)  
    	{  
    	System.out.print("*");  
    	}  
    	System.out.println(" ");  
    	}  
    	    }
    
    
 // Method to print pattern 14
    public static void printPattern14(int rows) {
    	for (int i= 0; i<= rows-1 ; i++)  
    	{  
    	for (int j=0; j<i; j++)  
    	{  
    	System.out.print(" ");  
    	}  
    	for (int k=i; k<=rows-1; k++)   
    	{   
    	System.out.print("*" + " ");   
    	}   
    	System.out.println("");   
    	}   
    	for (int i= rows-1; i>= 0; i--)  
    	{  
    	for (int j=0; j<i; j++)  
    	{  
    	System.out.print(" ");  
    	}  
    	for (int k=i; k<=rows-1; k++)  
    	{  
    	System.out.print("*" + " ");  
    	}  
    	System.out.println("");  
    	}  
    	 
    	}  
}