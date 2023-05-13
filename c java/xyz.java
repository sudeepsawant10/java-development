import java.util.*;
class xyz{
	public static void main(String[] args) {
		Vector ob = new Vector();
		Scanner obj = new Scanner(System.in);

		for(int i=0;i<5;i++){
			System.out.println("Enter element: ");
			int e = obj.nextInt();
			ob.add(e);
		}

		System.out.println("Vecotr Elements: " +ob);
		ob.add(20);
		System.out.println("Vecotr Elements: " +ob);

	}
}