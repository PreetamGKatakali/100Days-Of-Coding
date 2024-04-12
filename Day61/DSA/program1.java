public class program1 {
    public static void main(String[] args) {
        int n = 5; 
  
    // first outer loop to iterate through each row 
    for (int i = 0; i < 2 * n - 1; i++) { 
  
        // assigning values to the comparator according to 
        // the row number 
        int comp; 
        if (i < n) { 
            comp = 2 * (n - i) - 1; 
        } 
        else { 
            comp = 2 * (i - n + 1) + 1; 
        } 
  
        // first inner loop to print leading whitespaces 
        for (int j = 0; j < comp; j++) { 
            System.out.print(" "); 
        } 
  
        // second inner loop to print stars * 
        for (int k = 0; k < 2 * n - comp; k++) { 
            System.out.print(k+1+" "); 
        } 
        System.out.println(); 
    } 
    }
}
