package Day84.DSA;

public class program1 {
    static boolean isPlaindrom(String str,int start,int n){
        if(start>=n/2){
            return true;
        }
        if(str.charAt(start)!=str.charAt(n-start-1)){
            return false;
        }
        return isPlaindrom(str, start+1, n);
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPlaindrom(str,0,str.length()));
    }
}
