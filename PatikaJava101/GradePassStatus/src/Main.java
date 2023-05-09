import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int math, physics, chemistry, history, music, count = 0;
        double average = 0;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Math point: ");
        math = inp.nextInt();
        if (math > 0 || math < 100) {
            average += math;
            count++;
        }

        System.out.print("Physics point: ");
        physics = inp.nextInt();
        if (physics > 0 || physics < 100) {
            average += physics;
            count++;
        }

        System.out.print("Chemistry point: ");
        chemistry = inp.nextInt();
        if (chemistry > 0 || chemistry < 100) {
            average += chemistry;
            count++;
        }

        System.out.print("History point: ");
        history = inp.nextInt();
        if (history > 0 || history < 100) {
            average += history;
            count++;
        }

        System.out.print("Music point: ");
        music = inp.nextInt();
        if (music > 0 || music < 100) {
            average += music;
            count++;
        }

        //Calculates average
        average = average / count;
        if (average >= 55) {
            System.out.println("Congratulations! You passed the class.");
        }
        else{
            System.out.println("Unfortunately, you failed the class.");
        }
        System.out.println("Average : " + average);
    }
}