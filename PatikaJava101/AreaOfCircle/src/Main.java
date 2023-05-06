import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int r;
        double pi = 3.14, area, perimeter;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.print("Enter the radius: ");
        r = inp.nextInt();

        //Calculates area of triangle
        area = pi * r * r;
        perimeter = 2 * pi * r;
        System.out.println("Area of Circle " + area);
        System.out.println("Area of perimeter " + perimeter);
    }
}