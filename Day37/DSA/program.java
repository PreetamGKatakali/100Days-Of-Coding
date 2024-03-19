package Day37.DSA;
public class program{
    public static boolean brackets(String s){
        int i=-1;
        char stack[]=new char[s.length()];
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{'|| c=='['){
                stack[++i]=c;
            }
            else{
                if(i>=0 && ((stack[i]=='(' && c==')')
                            ||(stack[i]=='{' && c=='}')
                            || (stack[i]=='[' && c==']'))){
                                i--;
                }
                else{
                    return false;
                }
            }
        }
        return i==-1;

    }
    public static void main(String[] args) {
        String std="()[]{}";
        if(brackets(std))
        {
            System.out.println("balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}