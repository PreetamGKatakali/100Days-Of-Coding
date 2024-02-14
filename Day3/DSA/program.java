package Day3.DSA;
/**
 * This is the other string program 
 * 
 * Write a program to count the occurnce of the letter in the string 
 */
public class program {
    public static void main(String[] args) {
        String str="hello world";
        int[] res=new int[128];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            res[c]++; 
        }
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                System.out.println((char)i+"-->"+res[i]);

            }
        }
    }
}
