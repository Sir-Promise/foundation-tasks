import java.util.Scanner;
public class SetOfIntegers{
   public static void main(String[]args){;
      Scanner input = new Scanner(System.in);
      int evenSum = 0;
      int oddSum = 0;
      System.out.println("Enter integers (enter 0 to stop):");
   while (true) {
      int num = input.nextInt();
      if (num ==0) break;
      if (num % 2 ==0) {
      evenSum += num;
      }else{
      oddSum += num;
      }
   }
   System.out.println("Sum of even integers: " 
+ evenSum);
   System.out.println("Sum of odd integers: " + oddSum);
  
   }
}
