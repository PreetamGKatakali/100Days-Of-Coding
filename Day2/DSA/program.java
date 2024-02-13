/**
 * Write a program to count how any letter are owel from the given string 
 */
public class program {
    public static void main(String[] args) {
        String str="hello world";
        char[] res=str.toCharArray();
        int count=0;
        String v="AEIOUaeiou";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(v.indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("count :"+count);
    }
}
