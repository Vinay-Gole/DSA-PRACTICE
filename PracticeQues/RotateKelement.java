package PracticeQues;

import java.util.Arrays;

public class RotateKelement {
    public static void main(String[] args) {
        
        int arr[]={2,4,5,6,3,8};
        int k=11;
      rotateKelements(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    static  void reverse(int arr[],int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--]=temp;    
        }  
    }
    static void rotateKelements(int arr[],int k){
        int n = arr.length;
    k = k % n;
    int start=0;
    int end=n-1;
    reverse(arr, start, k - 1);
    reverse(arr, k, end);
    reverse(arr, 0, end);

    }


}
