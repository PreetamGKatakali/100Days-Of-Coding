package Day9.DSA;

/**
 * Write a program to find how many way are there to climb the steps.
 */
public class program {
    static int find(int val){
        if(val==1){
            return val;
        }
        int[] arr=new int[val+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=val;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[val];
    }
    
    public static void main(String[] args) {
        int res=find(7);
        System.out.println(res);
    }
}
