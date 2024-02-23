package Day12.DSA;
/**
 * Brithday candles  
 */
public class program{
    static int BirthdayCakeCandles(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int count=0;
        for(int i:arr){
            if(i==max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3,4,1,5,1,5,4};
        int res=BirthdayCakeCandles(arr);
        System.out.println(res);
    }
}