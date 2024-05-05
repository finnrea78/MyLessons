import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int NOToPlayTo;

        Scanner in = new Scanner(System.in);

        System.out.println("Please input number to go to:");
        NOToPlayTo = in.nextInt();

        System.out.println(NOToPlayTo);

        for(int i = 1; i <= NOToPlayTo; i++){
            if(i%3 == 0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0 && i%3!=0){
                System.out.println("Buzz");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    


}
