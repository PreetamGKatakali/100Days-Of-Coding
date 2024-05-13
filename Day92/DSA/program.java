public class program{
    static int find(String a,String b){
        StringBuilder s=new StringBuilder();

        int count=0;

        while (s.length()<b.length()) {
            s.append(a);
            count++;
        }
        if(s.indexOf(b)!=-1){
            return count;
        }
        s.append(a);
        count++;
        if(s.indexOf(b)!=-1){
            return count;
        }
        return -1;

    }
    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";

        System.out.println(find(a,b));
    }
}