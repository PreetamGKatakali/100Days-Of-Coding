package Day56.DSA;
/**
 * write a program to swap the frist and last letter in the string
 */
public class prgram1 {
    public static void main(String[] args) {
        String str="hello world";
        char[] res=str.toCharArray();
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]==' '){
                char temp=res[i-1];
                res[i-1]=res[i-count];
                res[i-count]=temp;
                count=0;
            }
            else if(i==res.length-1){
                char temp=res[i];
                res[i]=res[i-count];
                res[i-count]=temp;
            }
            else{
                count++;
            }
        }
        System.out.println(new String(res));
    }
}
