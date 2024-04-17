public class MaxArrayElement {
    public static void main(String[] args) {
        int arr[]={2,1,45,3,8,9,5,6,0};
        System.out.println(maxArrayElement(arr));
    }

    static int maxArrayElement(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
