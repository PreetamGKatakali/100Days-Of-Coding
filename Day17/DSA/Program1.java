package Day17.DSA;
/**
 * Write a program to find the number is the armstrong number or not
 */
public class Program1 {
    static boolean isArmstrong(int val){
        int sum=0;
        int number=val;
        while(val!=0){
            int temp=val%10;
            sum+=(temp*temp*temp);
            val=val/10;
        }
        if(number==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number=153;
        System.out.println(isArmstrong(number));
    }
}
