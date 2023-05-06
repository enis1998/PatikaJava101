import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int math, physics, chemistry, history, music;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking values from user
        System.out.print("Math point: ");
        math = inp.nextInt();

        System.out.print("Physics point: ");
        physics = inp.nextInt();

        System.out.print("Chemistry point: ");
        chemistry = inp.nextInt();

        System.out.print("History point: ");
        history = inp.nextInt();

        System.out.print("Music point: ");
        music = inp.nextInt();

        int total = math + physics + chemistry + history + music;
        double average = total / 5.0;

        if (average > 60.0) {
            System.out.print("Passed. :)");
        }
        else {
            System.out.print("Failed. :(");
        }
    }
}