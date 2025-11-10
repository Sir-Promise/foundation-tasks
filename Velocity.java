import java.util.Scanner;
public class Velocity{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter initial velocity, time taken, and acceleration: ");
   double initialVelocity = input.nextDouble();
   double timeTaken = input.nextDouble();
   double acceleration = input.nextDouble();
   double distance = ((initialVelocity * timeTaken) + 0.5 * (acceleration * (timeTaken * timeTaken)));
   System.out.println("The distance covered is " + distance + " kms");
   

   }

}
