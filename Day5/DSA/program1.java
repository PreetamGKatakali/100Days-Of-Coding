/**
 * Now we Will took on the learn search 
 * 
 * Write a program to find the number in the array 
 * 
 * Note : this is a basic but to understand the learch algo we have to do it
 */
public class program1 {
    public static void main(String[] args) {
        int[] res={1,2,3,4,5,6,7};
        int x=4;
        for(int i=0;i<res.length;i++){
            if(x==res[i]){
                System.out.println("x is at the index"+i);
            }
        }
    }
}
