package Day93.DSA;

import java.util.ArrayList;
import java.util.List;

public class program{
    static List<Integer> search(String text,String pattern){
        List<Integer> list=new ArrayList<>();

        int textLength=text.length();
        int patternLength=pattern.length();

        int patternHashcode=pattern.hashCode();

        for (int i = 0; i <= textLength - patternLength; i++) {
            String substring = text.substring(i, i + patternLength); // Get a substring of the same length as the pattern
            if (substring.hashCode() == patternHashcode && substring.equals(pattern)) {
                list.add(i); // If hashes match and substrings are equal, add the index to the occurrences list
            }
        }

        return list;


    }
    public static void main(String[] args) {
        String text = "ababcabababaab";
        String pattern = "aba";
        List<Integer> occurences=search(text,pattern);
        if(!occurences.isEmpty()){
            System.out.println("Pattern found at index");
            for(int i:occurences){
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("Pattern not found at index");
        }

    }
}