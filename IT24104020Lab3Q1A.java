import java.util.Scanner;

public class IT24104020Lab3Q1A{
	public static void main(String [] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the price of 1kg of rcie: ");
	double pricekg = scan.nextDouble();
	
	System.out.println("Enter the number of kilograms you want to buy : ");
	double kilograms = scan.nextDouble();

	double total = pricekg * kilograms;
	
	System.out.println("The total amount is: " + total % 10);
}
}