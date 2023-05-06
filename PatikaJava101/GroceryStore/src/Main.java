import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00, totalPrice = 0.0;
        int pearkg, applekg, tomatokg, bananakg, auberginekg;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the amount
        System.out.println("Pear: " + pear);
        System.out.println("Apple " + apple);
        System.out.println("Tomato " + tomato);
        System.out.println("Banana " + banana);
        System.out.println("Aubergine: " + aubergine);

        System.out.print("Choose pear(kg): ");
        pearkg = inp.nextInt();

        System.out.print("Choose apple(kg): ");
        applekg = inp.nextInt();

        System.out.print("Choose tomato(kg): ");
        tomatokg = inp.nextInt();

        System.out.print("Choose banana(kg): ");
        bananakg = inp.nextInt();

        System.out.print("Choose aubergine(kg): ");
        auberginekg = inp.nextInt();

        //Calculates area of triangle
        totalPrice = pearkg * pear + applekg * apple + tomato * tomatokg +
        banana * bananakg + auberginekg * aubergine;
        System.out.println("Total price " + totalPrice);
    }
}