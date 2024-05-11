package Day90.DSA;

public class program1 {
    static int fun(int N,int R){
        int res=1;

        for(int i=0;i<R;i++){
            res=res*(N-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fun(5-1, 3-1));
    }
}
