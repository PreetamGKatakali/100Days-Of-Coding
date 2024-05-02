package Day81.DSA;

public class program{
    static int findPeek(int[] arr){
        if(arr.length==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int low=1;int right=arr.length-1;
        while (low<=right) {
            int mid=(low+right)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int res=findPeek(arr);
        System.out.println(arr[res]);
    }
}