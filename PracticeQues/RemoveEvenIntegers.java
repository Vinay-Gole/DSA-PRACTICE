package PracticeQues;

import java.util.Arrays;

public class RemoveEvenIntegers {
    
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int ans[]=removeEvenInteger(arr);
        System.out.println(Arrays.toString(ans));
    }
     static int [] removeEvenInteger(int arr[]){
        int n=arr.length;
        int oddCount=0;

        for(int i=0;i<n;i++){
            if(i%2!=0){
                oddCount++;
            }
        }

        int result[]= new int [oddCount];
        int index=0;

        for(int i=0;i<n;i++){
            if(i%2!=0){
                //for removing even integers
                // i%2==0
                result[index++]=arr[i];
            }

        }
 return result;
     }
}
