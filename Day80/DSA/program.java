package Day80.DSA;

import java.util.ArrayList;
import java.util.List;

public class program{
    static List<List<String>> palindrome(String str){
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        func(0,str,path,res);
        return res;
    }
    static void func(int index,String str,List<String> path,List<List<String>> res){
        if(index==str.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<str.length();i++){
            if(isPlaindrom(str,index,i)){
                path.add(str.substring(index, i+1));
                func(i+1, str, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    private static boolean isPlaindrom(String str, int index, int i) {
        while (index<=i) {
            if(str.charAt(index++)!=str.charAt(i--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="aabb";

        System.out.println(palindrome(str));


    }
}