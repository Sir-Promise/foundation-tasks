import java.util.Scanner;
public class Dice{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first number");
   int num1 = input.nextInt();
   System.out.print("Enter second number");
   int num2 = input.nextInt();
   int total = num1 + num2;
   System.out.println("The first die: " + num1);
   System.out.println("The second die: " + num2);
   System.out.println("The total roll is = " + total);

   }

}
