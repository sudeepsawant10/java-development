import java.util.Scanner;

class Vowel{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Character: ");
		char c = obj.next().charAt(0);

		switch(c){
			case 'A':case 'a':
			case 'E':case 'e':
			case 'I':case 'i':
			case 'O':case 'o':
			case 'U':case 'u': 
					  System.out.println(c + " is Vowel");
					  break;
			default: System.out.println(c + " is consonant !");
					 break;

		}
	}
}