public class Main {
    public static void main(String[] args) {
        String functions = "+";
        int  num1, num2;
        num1 = 1;
        num2 = 2;

        switch(functions){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
        }



    }
}
