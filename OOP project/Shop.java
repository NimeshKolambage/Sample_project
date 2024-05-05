import java.util.Scanner;

//The assumption is that a customer purchases items exclusively from a single category or type of product.

public class Shop
{
		
	public static void main(String[] args)
	{
		
    Scanner scanner = new Scanner(System.in); //This line creates a Scanner object named scanner to read input from the console.

    System.out.print("Enter the number of clothing items: ");
    int numItems = scanner.nextInt();

    double[] price = new double[numItems]; //This line declares an array named price of type double with a size equal to numItems.

    for (int i = 0; i < numItems; i++) {
        System.out.print("Enter price for clothing item " + (i + 1) + ": ");
        price[i] = scanner.nextDouble(); //This line reads a double input from the user using the Scanner object scanner 
		                                 //and stores it in the i-th element of the price array.
    }

    int choice;

    System.out.print("Enter payment method (1 - Cash, 2 - Card): ");
    choice = scanner.nextInt();

    if (choice == 1) 
	{
        CashPayment CP = new CashPayment("2024/02/19", price);
		CP.displayCash();
		
    }else if(choice==2)
	{	
		CardPayment CRD = new CardPayment("Nimal", "Commercial Bank", price);
		CRD.displayCard();
		
	}		
    

    Customer C1 = new Customer("Thumula", 11122344, "C001", "OR02", "2024/02/19", price);
    C1.displayCustomer();

    Product pro1 = new Product("Trouser", "T001", 1500f, "Black", "Medium", "Gents", "Cotton");
    pro1.displayDetails();

    scanner.close(); // Close the scanner to avoid resource leak
	
	}
}