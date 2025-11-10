import java.util.Scanner;
public class FinancialApp{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter balance: ");
double balance = input.nextDouble();
System.out.print("Enter annual interest rate: ");
double annualInterestRate = input.nextDouble();
double monthlyInterest = balance * ((annualInterestRate / 100) / 12);
System.out.printf("The monthly interest rate is : %.4f%n", monthlyInterest);

}



}
