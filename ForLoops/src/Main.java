public class Main {
    public static void main(String[] args) {

        int max = 5;
        for (int i = 0; i < max; i++){
            for(int x = max - i; x > 0; x--){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
