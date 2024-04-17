public class SecondMaxElement {
    public static void main(String[] args) {
        int arr[]={2,1,45,3,8,9,5,6,0};
        System.out.println("second max is:"+secondMaxElement(arr));
    }
    static int secondMaxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
}
