import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int year;

        //Scanner initialization
        Scanner input = new Scanner(System.in);

        //Taking the numbers
        System.out.print("Please enter a year : ");
        year = input.nextInt();

        //Finds zodiac
        if((year % 4 == 0 && Double.valueOf(year / 4) == (int)year / 4) && (year % 100 != 0)){
            System.out.println(year + " ->" + " is a leap year!");
        }else if((year % 100 == 0) && (year % 400 == 0 && Double.valueOf(year / 400) == (int)year / 400)){
            System.out.println(year + " ->" + " is a leap year!");
        }
        else{
            System.out.println(year + " ->" + "isn't a leap year!");
        }
    }
}