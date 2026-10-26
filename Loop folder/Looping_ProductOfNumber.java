"""Find the product of numbers from 1 to 10."""

public class Looping_ProductOfNumber{
    public static void main(String[] args) {
    
    int products = 1;
    for(int numbers = 1 ; numbers <= 10; numbers++) {
       
       products *= numbers;
     
    }
    System.out.println(products);
  }
}
