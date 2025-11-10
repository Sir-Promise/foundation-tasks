import java.util.Scanner;
public class BMICalculator{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your weight in pounds: ");
    double weight = input.nextDouble();
    System.out.print("Enter your height in inches: ");
    double height = input.nextDouble();

    double result = weight * 703 /(height * height);
    System.out.println("BMI= "+ result);

    }
}
