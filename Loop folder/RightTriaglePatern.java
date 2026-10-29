public class RightTriaglePatern {

    public static void main(String[] args) {
        
        int size = 6;
        for(int row = 1;row <= size; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            }
        System.out.println( );   
        }
    }
}
