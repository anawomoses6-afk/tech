public class InvertedTrianglePattern {

  public static void main(String[] args) {
      
      int  size = 9;
      for(int row = size; row >= 1; row--) {
          for(int column = 1; column <= row; column++) {
              for(int star = 1; star <= size; star++) {
                    for(int gar = 1; gar <= size; gar++) {
                        System.out.print("*" + " " );
                    }
                  System.out.println(  );
              }
            System.out.println("*" + "  " );
          }
          System.out.println(   );
      }
    }
}


