public class CubeFour {
    public static void main(String[] args) {
        int counter = 0;
        
        for(int count = 1; count <= 5; count++) {
            counter = count * count * count;
            System.out.println(counter);
        }
    }
}
