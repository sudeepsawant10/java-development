
import java.util.Scanner;

class Year{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Days: ");
		int inputDays = obj.nextInt();
		int days; 
		int year; 

		if(inputDays==0){
			System.out.println("Zero is not valid!");
		}
		else if(inputDays<0){
			System.out.println("Days cannot be negative!");
		}
		else{
		year= inputDays/365;
		days = inputDays%365;

		System.out.println("Year: " + year);
		System.out.println("Days: " + days);
		}
	}
}