public class MinArrayElement {
    public static void main(String[] args) {
        int arr[]={2,1,45,3,8,9,5,6,0};
        // minArrayElement(arr);
        System.out.println("Minimum Element is:"+minArrayElement(arr));
        // printArray(arr);
        
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline at the end
      }
    
    static int  minArrayElement(int arr[]){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
