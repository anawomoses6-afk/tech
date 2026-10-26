public class SumOfNumber {

    public static void main(String[] args) {
        
        int Sum = 0;
        for(int count = 1; count <= 100; count++) {
          if (count % 2 ==0) {
          Sum = Sum + count++;
          }
            System.out.println(Sum);
        }
        
    }
}
