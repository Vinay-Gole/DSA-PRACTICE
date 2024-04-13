package ArrayQuestions;

/**
 * RemoveEvenIntegers
 */
public class RemoveEvenIntegers {

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    arr = removeEven(arr);
    System.out.println("Output:");
    printArray(arr);
  }

  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(); // Newline at the end
  }

  static int[] removeEven(int arr[]) {
    int n = arr.length;
    int oddCount = 0;

    // Count the number of odd elements
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 != 0) {
        oddCount++;
      }
    }

    // Create a new array to hold the odd elements
    int ans[] = new int[oddCount];
    int idx = 0;

    // Populate the new array with odd elements from the input array
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 != 0) {
        ans[idx] = arr[i];
        idx++;
      }
    }
    return ans;
  }
}
