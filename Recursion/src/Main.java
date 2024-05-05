public class Main {
    public static void main(String[] args) {
        //numPrint(10);
        //System.out.println("Factorial: " + Factorial(4));
        System.out.println("Sum of number from 0 - 5 " + sumUp(5, 2));
    }

    static void numPrint(int count){
        count--;
        if(count == 0){
            return;
        }
        else {
            System.out.println("num: " + count);
        }
        numPrint(count);
    }

    static int Factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * Factorial(n-1);
        }

    }

    static int sumUp(int count, int start){
        if(count == 0){
            return 0;
        }
        else {
            return start + count + sumUp(count-1, start);
        }
    }


}
