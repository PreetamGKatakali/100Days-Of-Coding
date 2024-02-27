package Day16.DSA;
/**
 * find the peak element which is not smaller than the its neighbours
 */
public class program{
    static int find(int[] arr,int length){
        if(length==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[length-1]>=arr[length-2]){
            return length-1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,3,20,4,1,0};
        int n=arr.length;
        System.out.println("Index is of the element"+find(arr,n));
    }
}