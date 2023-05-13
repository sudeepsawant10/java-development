
class Convert{
	public  int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }

  public long convertDecimalToBinary(int n) {
    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
       // System.out.println("Step " + step++ + ": " + n + "/2");
       // System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;
        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
}
class Main {
    
  public static void main(String[] args) {
    long num = 110110111;
    Convert ob = new Convert(); 
    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + ob.convertBinaryToDecimal(num));

    int num2 = 19;
    System.out.println("\n" + "Decimal to Binary");
    System.out.println(num2 + " = " + ob.convertDecimalToBinary(num2));
  }

}
/*
class Main {

  public static void main(String[] args) {
    
    }

  
}
*/