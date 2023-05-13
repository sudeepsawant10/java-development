import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = obj.nextLine();
		System.out.println("User name is: " + name);

		System.out.println("Enter Age: ");
		int age = obj.nextInt();
		System.out.println("Your age is : "+age);

		System.out.println("Enter Character: ");
		String ch = obj.nextLine();
		System.out.println("charcter is : " + ch);

		System.out.println("Enter percentage: ");
		float per = obj.nextFloat();
		System.out.println("Your percentage: " + per);

		System.out.println("Enter Double: ");
		double d = obj.nextDouble();
		System.out.println("Your double value: " + d);
	}
}