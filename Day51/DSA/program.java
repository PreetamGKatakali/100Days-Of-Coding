package Day51.DSA;


import java.util.HashSet;
import java.util.Set;

/**
 * Longest substring without repeating characters
 */
public class program {
    public static void main(String[] args) {
        String str="abcabcebb";
        int max_length=0;
        int left=0;
        Set<Character> list=new HashSet<>();

        for(int right=0;right<str.length();right++){
            if(!list.contains(str.charAt(right))){
                list.add(str.charAt(right));
                max_length=Math.max(max_length, right-left+1);
            }
            else{
                while(list.contains(str.charAt(right))){
                    list.remove(str.charAt(right));
                    left++;

                }
                list.add(str.charAt(right));
            }
        }

        System.out.println(max_length);
        System.out.println(list);

    }
}