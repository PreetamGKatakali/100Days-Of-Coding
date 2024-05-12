public class program{
    static void pascalTriangle(int n){
        int res=1;
        System.out.print(res+" ");

        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            System.out.print(res+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int  n=5;
       pascalTriangle(n);
    }
}