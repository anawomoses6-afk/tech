import java.util.Arrays;
public class Arraone{
  public static void main(String[] args) {

        int [] numbers = {10, 65, 20,50, 60};

       Arrays.sort(numbers);
       System.out.println(Arrays.toString(numbers));
    
      int[] numbers = {10, 50, 60, 80};
    
      int result = Arrays.binarySearch(numbers, 60);
           System.out.println(result);
    
        
  }
}


