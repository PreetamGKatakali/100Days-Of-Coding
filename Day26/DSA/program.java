public class program{
    static int minarray(int a,int b,int c){
        return Math.min(Math.min(a, b),c);
    }
    public static void main(String[] args) {
        int[] arr={5,2,8};
        int[] arr1={10,7,12};
        int[] arr2={9,14,6};

        System.out.println(minarray(arr[0],arr[1], arr[2]));

        System.out.println(minarray(arr1[0], arr1[1], arr1[2]));

        System.out.println(minarray(arr2[0], arr2[1], arr2[2]));

       

    }
}