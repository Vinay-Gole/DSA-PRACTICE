public class ResizeArray {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9,3};
        System.out.println("size before :"+arr.length);
       arr= arrresize(arr, 10);
        System.out.println("size after :"+arr.length);

        printArray(arr);

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println(); // Newline at the end
      }

    static int[] arrresize(int arr[],int capacity){
        // capacity=arr.length*capacity;
        int temp[]= new int [capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];

        }

        arr=temp;
        return arr;
    }
}
