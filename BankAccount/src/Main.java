import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Account Finn = new Account(100);
        Account Ryan = new Account(100);


        System.out.println("Hi whats your name:");
        Finn.SetName(sc.next());
        System.out.println("Hi " + Finn.GetName());

        System.out.println("How much do you want to add");
        Finn.AddToBalance(sc.nextInt());
        System.out.println(Finn.PrintBalance());

        System.out.println("How much do you want to withdraw");
        Finn.WithDrawFunds(sc.nextInt());
        System.out.println(Finn.PrintBalance());



    }
}

