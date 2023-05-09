import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        double n1,n2,n3;

        //Scanner initialization
        Scanner input = new Scanner(System.in);

        //Taking the numbers
        System.out.print("Enter the number: ");
        n1 = input.nextDouble();
        System.out.print("Enter the number: ");
        n2 = input.nextDouble();
        System.out.print("Enter the number: ");
        n3 = input.nextDouble();

        //Sorts5
        if (n1 > n2 && n1 > n3 && n2 > n3){
            System.out.print(n1 + ">" + n2 + ">" + n3);
        }
        else if(n1 > n2 && n1 > n3 && n3 > n2){
            System.out.print(n1 + ">" + n3 + ">" + n2);
        }
        else if( n2 > n1 && n2 > n3 && n1 > n3){
            System.out.print(n2 + ">" + n1 + ">" + n3);
        }
        else if( n2 > n1 && n2 > n3 && n3 > n1){
            System.out.print(n2 + ">" + n3 + ">" + n1);
        }
        else if( n3 > n1 && n3 > n2 && n1 > n2){
            System.out.print(n3 + ">" + n1 + ">" + n2);
        }
        else if( n3 > n1 && n3 > n2 && n2 > n1){
            System.out.print(n3 + ">" + n2 + ">" + n1);
        }
        else{
            System.out.println("Equality situations are excluded from the possibilities.");
        }
    }
}