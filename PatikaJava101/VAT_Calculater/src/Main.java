import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        double amount, vatRate = 0.18;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.print("Enter the amount: ");
        amount = inp.nextDouble();

        if (amount > 1000) {
            vatRate = 0.08;
        }

        //Calculates VAT amount
        double vatAmount = amount * vatRate;
        System.out.println("Amount without VAT: " + amount);
        amount += vatAmount;
        System.out.println("Amount with VAT: " + amount);
        System.out.println("VAT rate: " + vatRate);
        System.out.println("Amount VAT: " + vatAmount);

    }
}