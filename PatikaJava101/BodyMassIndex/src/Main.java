import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int kg;
        double height, index;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.print("Enter the height(meter): ");
        height = inp.nextInt();

        System.out.print("Enter the weight(kg): ");
        kg = inp.nextInt();

        //Calculates area of triangle
        index = kg * height * height;
        System.out.println("Your Body Mass Index " + index);
    }
}