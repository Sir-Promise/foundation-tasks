import java.util.Scanner;
   public class Kilometer{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter distance in mile: ");
   double miles = input.nextDouble();
   double kilometers = miles * 1.6;
   System.out.println(miles + " mile is " + kilometers + " kilometers");

   }
}
