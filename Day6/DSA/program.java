package Day6.DSA;

/**
 * Today we will earn about the binary search 
 * 
 * we are using the binary search becuase to find the element from the given array 
 * 
 * Note : inorder to apply binary search the array need to be in the sorted.
 * 
 * Binary search is better than the linear search becuase linear eacrh time complixty is more than comapre to the binary search
 */
public class program{
    static int binary(int arr[],int val){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==val){
                return mid;
            }
            else if(arr[mid]<val){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int res=binary(arr, 12);
        if(res!=-1){
            System.out.println("the element is present in the index of :"+res);
        }
        else{
            System.out.println("the element is not present");

        }
    }
}