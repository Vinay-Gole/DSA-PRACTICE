public class secondMinElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,3,5};
        System.out.println("second Min Element:"+secondMinElement(arr));
    }
    static int secondMinElement(int arr[]){
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }else if(arr[i]<secondmin && arr[i]!=min){
                secondmin=arr[i];
            }
        }
        return secondmin;
    }
}
