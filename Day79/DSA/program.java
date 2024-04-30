package Day79.DSA;
/**write a program to find the longest palindromic substring in the give string */
public class program{
    static boolean isPalindrom(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static String longestPalindromic(String str){
        if(str.length()<=1){
            return str;
        }
        int maxLength=1;
        String res="";

        for(int i=0;i<str.length();i++){
            for(int j=maxLength+i;j<=str.length();j++){
                if(j-i>maxLength && isPalindrom(str.substring(i,j))){
                    maxLength=j-i;
                    res=str.substring(i,j);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="babaddddda";
        System.out.println(longestPalindromic(str));
    }
}