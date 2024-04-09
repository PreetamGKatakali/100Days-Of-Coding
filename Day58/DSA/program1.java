package Day58.DSA;

public class program1 {
    public static void main(String[] args) {
        int n=65;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
