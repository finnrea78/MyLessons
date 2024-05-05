public class Account {
    private int balance = 0;
    private String name;



    public Account(int inbalance){
        balance = inbalance;
    }





    public void SetName(String inName) {
        name = inName;
    }
    public String GetName(){
        return name;
    }
    public void AddToBalance(int money){
        balance += money;
    }
    public void WithDrawFunds(int money){

        if(money > balance){
            System.out.println("You dont have enough money");
        }else{
            balance -= money;
        }
    }


    public int GetBalance(){
        return balance;
    }


    public String PrintBalance(){
        return "Your balance is: " + balance;
    }



}
