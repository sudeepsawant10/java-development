
/*
File Handling:
-File Manage[create,update,read,delet]
-Stream = flow of binary
Classes:
1. OutputStream
-write(put) the data into file.
-write methods
-child classes

2.InputStream
-Read(get) the data from the file.
-Read methods
-child classes

OutPutStream=>Write()
InputStream=> Read()

steps:
1. Create FIle Object .
2. File Create 
3.Write() Or Read()
4. Excepton Handling
*/

import java.io.*;

class FileExample{
	public static void main(String[] args) {
		//File =create file
		//we are in class so we have to handle it.
		

		try{
		FileOutputStream out = new FileOutputStream("file1.txt");
		// String s ="Welcome to java file handling";
		// byte b[] = getBytes();
		out.write(65);//ascii number
		// out.write(b);


			// FileInputStream in = new FileInputStream("File1.txt");//File must be exists.
			// int i=0;
			// while(i=in.read()!=-1){	//-1 = end of file
			// 	System.out.print((char)i);
			// }
		}
		catch(Exception e){
			System.out.println(e);
		}


	}
}
