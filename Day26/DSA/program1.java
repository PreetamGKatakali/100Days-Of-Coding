public class program1 {
    static void subArraySum(int arr[],int n,int sum){
        for(int i=0;i<n;i++){
            int currentsum=arr[i];
            if(currentsum==sum){
                System.out.println("sum of the "+i);
                return;
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    currentsum+=arr[j];
                    if(currentsum==sum){
                        System.out.println("sum of the "+i+" and "+j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
    public static void main(String[] args) {
        int[] arr={15,2,4,8,9,5,10,23};
        int n=arr.length;
        int sum=23;
        subArraySum(arr,n,sum);

    }
}
