import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating variables
        String username,password,newPassword,choose;

        //Scanner initialization
        Scanner inp = new Scanner(System.in);

        //Taking the numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        //User login
        if(username.equals("eniskeskin") && password.equals("1998")){
            System.out.print("Logging into your account, please wait...");
        }
        else {
            System.out.println("Your username or password is incorrect.");
            System.out.print("Would you like to reset your password? [Y/N]: ");
            choose = input.nextLine();
            switch (choose){
                case "Y" :
                    System.out.print("Enter your new password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)){
                        System.out.print("Your password cannot be the same as your previous password. Rebuild.");
                    }
                    else {
                        System.out.print("Your password has been changed.");
                    }
                case "N":
                    System.out.print("Try logging into your account again.");
            }

        }
    }
}