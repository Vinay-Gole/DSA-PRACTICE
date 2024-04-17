public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={4,1,0,1,5,0,2,8};
       moveZerostoEnd(arr);
       printArray(arr);
    }

    
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline at the end
      }


    static void moveZerostoEnd(int arr[]){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
