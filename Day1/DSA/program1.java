package Day1.DSA;
/**
 * Day1!! 
 * 
 * Write a program to reverse the string 
 * 
 */
public class program1 {
    public static void main(String[] args) {
        String str="my name is smith";
        String rev="";
        String curr="";
        for(char s : str.toCharArray()){
            if(s==' '){
                rev=curr+" "+rev;
                curr="";
            }
            else{
                curr+=String.valueOf(s); //coverting the char to string datatype
            }
        }
        rev=curr+" "+rev;
        System.out.println(rev);
    }
}
