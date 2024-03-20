package Day38.DSA;

import java.util.Stack;
import java.util.Vector;
/**
 * remove the middle element from the stack
 */
public class program{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Vector<Integer> v=new Vector<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while (!st.isEmpty()) {
          v.add(st.pop());  
        }
        if(v.size()%2==0){
            int target=v.size()/2;
            for(int i=0;i<v.size();i++){
                if(i==target){
                    continue;
                }
                else{
                    st.push(v.get(i));
                }
            }
        }
        else{
            int target=(int)Math.ceil(v.size()/2);
            for(int i=0;i<v.size();i++){
                if(i==target){
                    continue;
                }
                else{
                    st.push(v.get(i));
                }
            }
        }
        System.out.println(st);
    }
}