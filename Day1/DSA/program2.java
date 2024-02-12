package Day1.DSA;
/**
 * Day1!
 * 
 * Write a program to check the precentage of the letter in the given string.
 */
public class program2 {
    public static void main(String[] args) {
        String str="hello world";
        char[] res=new char[128];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            res[c]++;
        }
        int length=str.length()*100/100;
        for(int i=0;i<res.length;i++){
            if(res[i]!=0)
            {
                System.out.println((char)i+"-->"+res[i]*100/length+"%");
            }
        }

    }
}
