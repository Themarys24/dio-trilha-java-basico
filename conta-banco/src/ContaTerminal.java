import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int number ;
        String agency ;
        String customerName ;
        double balance = 237.48 ;

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter the agency number:  ");
        agency = scan.next();

        System.out.println("Please enter the user number:  ");
        number = scan.nextInt();

        System.out.println("Please enter the Customer Name:  ");
        customerName = scan.next();

        System.out.println("Hello " + customerName + ", thanks you for creating an account with our bank, your Agency is: " + agency +
         ", Account: " + number + " and your balance: " + balance + " is now available for withdrawal");


    }
}
