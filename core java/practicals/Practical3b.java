public class Practical3b{
    public static void main(String args[]){
       
        int number = Integer.parseInt(args[0]);
        int sum = 0; 
        int input = number;
        while (input != 0){
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10; 
        }
        System.out.printf("Sum of digits of number %d is %d", number, sum);
       
    }
}