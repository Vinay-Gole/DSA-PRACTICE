public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int start=0;
        int end=arr.length-1;
        reverse(arr, start, end);
        printArray(arr);

        for(int i=end;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }


    // OR

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline at the end
      }
    static void reverse(int arr[],int start,int end){
        
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
}
