package Day54.DSA;

public class program{
    static boolean isBalanced(String str){
        int openBrackets=0;

        for(char c:str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                openBrackets++;
            }
            if(c==')'||c=='}'||c==']'){
                openBrackets--;
            }
        }
        if(openBrackets!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="(())";
        System.out.println(isBalanced(str));
    }
}