public class WhileFactoring {

    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        
        while (number > 1){
        
         factorial = factorial * number;
          number--;
        }
     System.out.println(factorial);
    }

}
