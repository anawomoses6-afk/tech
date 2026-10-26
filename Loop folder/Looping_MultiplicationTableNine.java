"""Find the sum of numbers from 1 to 100."""

public class Looping_MultiplicationTableNine {

    public static void main(String[] args) {
    
      for (int index = 1; index <= 100; index++) {
      
        if (index % 4 == 0) {
          continue;
        
        }
        else {
              System.out.println(index);
        }
      
      }
    }   
}
