import java.util.Scanner;
class Stringprogram{
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter string 1: ");
		String s1 = obj.nextLine();
		
		System.out.println("Enter string 2: ");
		String s2 = obj.nextLine();
		
		if(s1.equals(s2)){
			System.out.println("Both strings are equal");
		}
		else
			System.out.println("Not Equal");

		//contain()
	
		if(s1.contains(s2))
			System.out.println("Yes string 1 contain string s1");

		//space count
		String s3 = s1.concat(" "+s2);
		System.out.println("Concatenation: " +s3);
		String space[] = s3.split("\\s");
		int count=0;
		for(int i = 1; i<space.length; i++){
			count+=1;
		}
		System.out.println("Total spaces are: " +count);

		//using toCharArray()
		int count2=0;
		String s4 = s3;  
        char[] ch = s4.toCharArray();  
        int len = ch.length;  
       
        for (int i = 0; i < len; i++) {  
            if(ch[i]==' ')
            	count2++;
        }
        System.out.println(count2);
	 }
}