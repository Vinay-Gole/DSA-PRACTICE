public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={2,1,7,5,6,4,8,9};
        System.out.println(missingNumber(arr, 9));
       

    }
    static int missingNumber(int arr[],int n){
        int sum=n*(n+1)/2;
        for(int num:arr){
             sum=sum-num;
        }
        return sum;
    }
}
