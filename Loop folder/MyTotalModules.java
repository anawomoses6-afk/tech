public class MyTotalModules {
    
    public static void main(String ...args){
    int result = MultiplesOfEight(1, 200);
    System.out.print(result + ", ");
  }

      public static int MultiplesOfEight(int firstNumber, int secondNumber){
        int result = 0;
        for(int count = firstNumber; count <= secondNumber; count++){
          if(count % 8 == 0){
           result = count;
           System.out.println(count + ", ");
        }
        }
         return result;
      }
}
