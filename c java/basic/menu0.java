import java.util.Scanner;
class Menu{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		
		System.out.println("1. Find ASCII value of Character");
		System.out.println("2. Compute qutient and remainder");
		System.out.println("3. Check whether no. is even or odd");
		System.out.println("4. Find largest no. among three numbers");
		System.out.println("5. Calculate area and primeter of circle");
		System.out.println("Enter your choice: ");
		int op = obj.nextInt();
			switch(op){
				case 1: System.out.println("Enter Character : ");
						char c = obj.next().charAt(0);
						System.out.println("ASCII value = " + (int)c );
						break;
				case 2: System.out.println("Enter divisor and divident: ");
						float a = obj.nextFloat();
						float b = obj. nextFloat();
						System.out.println("Quotient = "+ (float)a/b);
						System.out.println("Remainder = " + (float)a%b);
						break;
				case 3: System.out.println("Enter number: ");
						int no = obj.nextInt();
						if(no%2 == 0)
							System.out.println("Even");
						else
							System.out.println("Odd");
						break;
				case 4: System.out.println("Enter three numbers: ");
						int x = obj.nextInt();
						int y = obj.nextInt();
						int z = obj.nextInt();
						if(x>y && x>z)
							System.out.println(x + " is greater.");
						else if(y>z && y>x)
							System.out.println(y + " is greater.");
						else
							System.out.println(z + " is greater.");
						break;
				case 5: System.out.println("Enter the value of r : ");
						int r = obj.nextInt();
						float pi = 3.14f;
						float area;
						float per;
						area = pi*r*r;
						per = 2*pi*r;
						System.out.println("Area of circle = " + area);
						System.out.println("Perimeter of circle = "+ per);
						break;
				case 6: System.out.println("Exit!");
						break;
				default: System.out.println("Invalid input!");
						break;
			}
	 }
}