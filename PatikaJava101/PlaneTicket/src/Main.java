import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        int distanceKm, age, travelType, type;
        double ageDiscount, travelDiscount, discountedPr = 0;

        //Scanner initialization
        Scanner input = new Scanner(System.in);

        //Taking the numbers
        System.out.print("How many kilometers will you travel : ");
        distanceKm = input.nextInt();
        System.out.println();
        System.out.print("How old are you ? ");
        age = input.nextInt();
        System.out.println();
        System.out.print("What is your travelling type ?" + "\n" + "For example; " +
                "one way(press 1) or  round trip(press 2). " + "\n");
        travelType = input.nextInt();

        //Finds horoscope
        double pricePerKm = 0.10 * distanceKm;
        if(distanceKm <= 0 || age <= 0 || !((1 == travelType) || (2 == travelType))){
            System.out.println("You've entered wrong information !");
        }else if( age < 12){
            ageDiscount = pricePerKm / 2;
            discountedPr = pricePerKm - ageDiscount;
        }else if(12 <= age && 24 >= age){
            ageDiscount = pricePerKm * 0.10;
            discountedPr = pricePerKm - ageDiscount;
        }else if(age > 65){
            ageDiscount = pricePerKm * 0.30;
            discountedPr = pricePerKm - ageDiscount;
        }else{
            System.out.println("No discount. Price that you'll pay : " + pricePerKm);
        }
        if (travelType == 2) {
            travelDiscount = discountedPr * 0.20;
            discountedPr = (discountedPr -travelDiscount) * 2;
            System.out.println("Total amount of price : " + " => " + discountedPr);
        }
    }
}