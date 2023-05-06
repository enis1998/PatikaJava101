import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int firstEdge, secondEdge, thirdEdge;
        double trianglePerimeter, area;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.print("Enter the first edge: ");
        firstEdge = inp.nextInt();

        System.out.print("Enter the second edge: ");
        secondEdge = inp.nextInt();

        System.out.print("Enter the third edge: ");
        thirdEdge = inp.nextInt();


        //Calculates area of triangle
        trianglePerimeter = (firstEdge + secondEdge + thirdEdge) / 2;
        area = trianglePerimeter * (trianglePerimeter - firstEdge) *
                (trianglePerimeter - secondEdge) *
                (trianglePerimeter - thirdEdge);
        System.out.println("Square of area " + Math.sqrt(area));
    }
}