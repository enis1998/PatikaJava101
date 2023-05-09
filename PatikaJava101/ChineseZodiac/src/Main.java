import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int birthYear, zodiac;

        //Scanner initialization
        Scanner input = new Scanner(System.in);

        //Taking the numbers
        System.out.println("Please enter your birth year :");
        birthYear = input.nextInt();

        //Finds zodiac
        zodiac = birthYear % 12;

        switch (zodiac){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mice");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Please enter a proper year!");

        }
    }
}