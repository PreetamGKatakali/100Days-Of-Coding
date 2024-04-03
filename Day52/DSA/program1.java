package Day52.DSA;

public class program1{
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=4;i>=0;i--){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
           
            System.out.println();
        }
        
    }
}
