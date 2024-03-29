import java.util.Stack;

/**cheak weather the string is Palindrome */
public class program1 {
    public static void main(String[] args) {
        String str="hello";
        String res="";
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        for(int i=st.size()-1;i>=0;i--){
            res+=st.pop();
        }
        if(res.equals(str)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
