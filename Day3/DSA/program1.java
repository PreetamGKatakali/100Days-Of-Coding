package Day3.DSA;
/**
 * This program is simple i know but i have added this program to get brif into about the 
 * why string is immutabble 
 * 
 * 
 */
public class program1 {
    public static void main(String[] args) {
        String str="bab";
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
   
        if(temp.equals(str)){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }

    }
}
