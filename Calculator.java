import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1 = input.nextDouble();
        System.out.println("Enter the second number");
        double number2 = input.nextDouble();
        System.out.println("Select the operation to be performed: ");
        String operation = input.next();
        switch(operation){
            case "+" :
                double add = number1 + number2;
                System.out.println("The result of addition is: "+ add);
                break;

            case "-":
                double sub = number1-number2;
                System.out.println("The result of subtraction is: " + sub);
                break;

            case "*":
                double mult = number1*number2;
                System.out.println("The result of multiplication is: " + mult);
                break;
            case "/":
                double div = number1 / number2;
                System.out.println("The result of division is: " + div);
                break;
            default:
            System.out.println("The operation selected is invalid");
            break;
        }


    }
}
