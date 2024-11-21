import java.util.Scanner;

public class IT24104020Lab3Q2{
	public static void main(String [] args){
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enther the monthly salary: ");
	double monthlysalary = scan.nextDouble();
	
	System.out.println("Enter the number of OT hours: ");
	double othours = scan.nextDouble();

	System.out.println("Enter the OT hourly rate: ");
	double otrate = scan.nextDouble();

	double otamount = othours * otrate;
	double total = monthlysalary + otamount;

	System.out.println("The total salary including OT is : " + total); 
	
	
	
}
}