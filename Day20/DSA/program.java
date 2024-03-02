package  Day20.DSA;
//write a program to find the majority element from the array
public class program{
    static void findMajority(int arr[],int n){
        int max_count=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count > max_count){
                max_count=count;
                index=i;
            }
        }
        if(max_count>n/2){
            System.out.println(arr[index]);
        }
        else{
            System.out.println("no majority element");
        }
    }
    public static void main(String[] args) {
        int[] arr={ 1, 1, 2, 1, 3, 5, 1 };
        int n=arr.length;
        findMajority(arr,n);
    }
}