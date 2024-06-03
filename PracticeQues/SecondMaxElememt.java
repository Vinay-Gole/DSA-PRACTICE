package PracticeQues;

public class SecondMaxElememt {
    int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
    public SecondMaxElememt(int max, int secondMax) {
        this.max=max;
        this.secondMax=secondMax;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8,9,3};
        
        
    SecondMaxElememt  result=secMax(arr);
        System.out.println("Max Element is-> "+result.max);
        System.out.println("Second Max Element is-> "+result.secondMax);

    }
    static SecondMaxElememt secMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return new SecondMaxElememt(max,secondMax);
    }
}
