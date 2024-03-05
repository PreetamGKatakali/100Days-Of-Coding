package Day23.DSA;

public class program1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int frist=0;
        int secound=0;
        int third=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>frist){
                third=secound;
                secound=frist;
                frist=arr[i];
            }
            else if(arr[i]>secound){
                third=secound;
                secound=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println(frist+" "+secound+" "+third);
    }
}
