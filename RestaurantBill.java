import java.util.Scanner; // Needed for the Scanner class

/**
    This program calculates the tax and tip on a restaurant bill
*/

public class RestaurantBill
{
    public static void main(String[] args)
    {
        final double TAX_RATE = 0.0875; // Tax rate
        double bill;       // The restaurant bill
        double tip;        // The user's preferred tip percentage
        double tipAmount;  // The tip percentage added to the bill
        double tax;        // The tax amount
        double total;      // The grand total

        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        // Get the restaurant bill
        System.out.println("Enter the total amount ");
        bill = keyboard.nextDouble();

        // Get the preferred tip percentage
        System.out.println("What percentage do you want to tip? (Enter as a whole number) ");
        tip = keyboard.nextDouble();
        
        // Calculate tax
        tax = TAX_RATE * bill;

        // Calculate the new bill total plus tip
        tipAmount = (tip / 100) * (bill + tax); 

        // Calculate the total bill
        total = bill + tipAmount + tax;

        // Display output
        System.out.println("Restaurant Bill: $" + bill);
        System.out.println("Tax Amount: $" + tax);
        System.out.println("Tip Percentage entered is: " + tip + "%");
        System.out.println("Tip Amount: $" + tipAmount);
        System.out.println("Total Bill: $" + total);

        keyboard.close();
    }
}
