import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        double degree;


        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the numbers
        Scanner input = new Scanner(System.in);
        System.out.print("What is the temperature: ");
        degree = input.nextDouble();

        //Calculates average
        if(degree < 5){
            System.out.print("You can go ski");
        }
        else if(degree > 5 && degree < 15) {
            System.out.print("You can go cinema");
        }
        else if(degree > 15 && degree < 25){
            System.out.print("You can go on a picnic.");
        }
        else if(degree > 25){
            System.out.print("You can go swimming.");
        }
        else{
            System.out.print("Incorrect degree entry has been made.");
        }
    }
}