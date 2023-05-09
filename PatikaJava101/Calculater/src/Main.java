import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int number1, number2, select;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.print("Enter first number: ");
        number1 = inp.nextInt();
        System.out.print("Enter second number: ");
        number2 = inp.nextInt();
        System.out.println("1- Addition\n2- Subtraction\n" +
                "3- Multiplication\n4- Division");
        select = inp.nextInt();

        //Calculates area of triangle
        switch (select) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Please enter valid number");
                break;
        }
    }
}