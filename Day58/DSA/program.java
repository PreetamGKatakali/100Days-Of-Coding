package Day58.DSA;

public class program{
    public static void main(String[] args) {
        int rows = 5; 
  
    // outer loop for rows 
     for (int i = 1; i <= rows; i++) { 
  
        // inner loop 1 for leading white spaces 
        for (int j = 0; j < rows - i; j++) { 
            System.out.print(" "); 
        } 
  
        int C = 1; // coefficient 
  
        // inner loop 2 for printing numbers 
        for (int k = 1; k <= i; k++) { 
             System.out.print(C+" "); 
            C = C * (i - k) / k; 
        } 
        System.out.println();
    } 
    }
}