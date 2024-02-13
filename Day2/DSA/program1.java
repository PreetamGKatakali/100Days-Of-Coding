/**
 * Write the program to count the digits from the string
 */
public class program1 {
    public static void main(String[] args) {
        String str="pre7et1am7";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=48 && c<=57){
                sum+=c-48;
            }
        }
        System.out.println("The sum of the digit are :"+sum );

    }
}
