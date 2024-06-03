import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Example
 */
public class Example {
    

    public static void main(String[] args) {
        
        int[] arr = {1,3,7,8,8,5,2,2,7};

       
        IntStream str=Arrays.stream(arr);
        str.filter(n->n%2==0).sorted();
        System.out.println(str);
        
    }
}