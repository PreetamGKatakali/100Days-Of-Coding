package Day46.DSA;

import java.util.Stack;

/**implementing the two stack in the single array */
public class program1 {
    static int[] arr={1, 2, 3, 4, 5};
    static int[] arr1={6, 7, 8, 9, 10};
    static int[] res=new int[arr.length+arr1.length];
    static int top1=-1,top2=arr.length+arr1.length;

    static void pushfrist(int val){
        if(top1+1==top2){
            System.out.println("The List is empty");
            return;
        }
        top1++;   
        res[top1]=val;
    }
    static void pushSecound(int val){
        if(top1+1==top2){
            System.out.println("Stack is full");
            return;
        }
        top2--;
        res[top2]=val;
    }
    static void popfrist(){
        if(top1<0){
            System.out.println("the stack is empty");
            return;
        }
        int top=res[top1];
        top1--;
        System.out.println("the element is poped"+top);
    }
    static void popsecound(){
        if(top2>=arr.length){
            System.out.println("the stack is empty");
            return;
        }
        int top=arr[top2];
        top2++;
        System.out.println("the element is  poped"+top);
    }


    public static void main(String[] args) {
        for(int i=0;i<arr.length;i++){
            pushfrist(arr[i]);
        }

        for(int i=0;i<arr1.length;i++){
            pushSecound(arr1[i]);
        }
    }
}
