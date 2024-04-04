package Day53.DSA;

import java.util.Arrays;

public class program{
    static int MAX_SIZE=10;
    static int[] arr=new int[MAX_SIZE];
    static int top1=-1;
    static int top2=arr.length;

    static void pushStack1(int data){
        if(top1<top2-1){
            top1++;
            arr[top1]=data;
            System.out.println("the element is pushed to the stack1");
            
        }
        else{
            System.out.println("Stack1 is overflow");
        }
     
    }

    static void pushStack2(int data){
        if(top1<top2-1){
            top2--;
            arr[top2]=data;
            System.out.println("The element is pushed to Stack2");
        }
        else{
            System.out.println("Stack2 is overflow");
        }
    }

    static void popStack1(){
        if(top1>=0){
            top1--;
            System.out.println("The element is poped from the stack1");
        }
        else{
            System.out.println("Stack1 is underflow");
        }
    }

    static void popStack2(){
        if(top2<arr.length){
            top2++;
            System.out.println("The element is poped from the Stack2");
        }
        else{
            System.out.println("Stack2 is underflow");
        }
    }

    static void peekStack1(){
        if(top1==0){
            System.out.println("Stack1 is empty");
        }
        else{
            System.out.println(arr[top1]);
        }
    }
    static void peekStack2(){
        if(top2==arr.length-1){
            System.out.println("Stack2 is empty");
        }
        else{
            System.out.println(arr[top2]);
        }
    }
    public static void main(String[] args) {
      pushStack1(10);
      pushStack2(20);
      pushStack1(30);
      pushStack2(40);
      pushStack1(50);
      pushStack2(60);
      pushStack1(70);
      pushStack2(80);
      pushStack1(90);
      pushStack2(100);
      pushStack1(1);
      
      System.out.println(Arrays.toString(arr));
    }
}