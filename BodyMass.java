import java.util.Scanner;
public class BodyMass {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter weight in pounds:");
   double weightPounds = input.nextDouble();
   
   System.out.print("Enter height in inches:");
   double heightInches = input.nextDouble();

   double weightInKg = weightPounds * 0.45359237;
   double heightInMeters = heightInches * 0.0254;
   double bmi = weightInKg / (heightInMeters * heightInMeters);
   System.out.println("BMI is " + bmi);


   }
}
