package Day57.DSA;

public class program1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<2*(5-i)-1;j++){
                System.out.print("  ");
            }

            for(int k=0;k<2*i+1;k++){
                if(k==0||k==2*i||i==5-1){
                    System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
