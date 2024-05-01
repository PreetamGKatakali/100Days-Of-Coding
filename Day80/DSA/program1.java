package Day80.DSA;

public class program1 {
    static boolean linearSearch(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    static int longestSubstring(int[] arr){
        int longest=0;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;

            while(linearSearch(arr,x+1)==true){
                count+=1;
                x+=1;
            }

            longest=Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={100,200,1,2,3,4};

        System.out.println(longestSubstring(arr));

    
    }
}
