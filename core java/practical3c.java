/*
WAP to accept 10 numbers from the user and find the largest of 10 number ?
*/
import java.io.*;
class Large5Num
{
	public static void main(String args[])throws IOException
	{
		int intNum[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Elements !!!");
		for(int i=0;i<intNum.length;i++)
		{
			intNum[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<intNum.length;i++)
		{
			System.out.println("Array Element="+i+" "+intNum[i]);
		}
		int intLarge = intNum[0];
		for(int i=1;i<intNum.length;i++)
		{
			if(intLarge < intNum[i])
			{
			intLarge = intNum[i];
			}
		}
		System.out.println("Largest Number="+intLarge);
	}
}