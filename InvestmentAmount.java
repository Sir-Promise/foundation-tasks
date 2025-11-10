import java.util.Scanner;
public class InvestmentAmount{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter investment amount: ");
   double investmentAmount = input.nextDouble();

   System.out.print("Enter annual interest rate in percentage: ");
   double annualInterestRate = input.nextDouble();
   double monthlyInterestRate = balance * (annualInterestRate / 100) / 12;

   System.out.print("Enter number of years: ");
   int numberOfYears = input.next.int();
   double futureInvestmentValue = InvestmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
   System.out.printf("Accumulated value is $ %.2f", futureInvestmentValue);



   }
}




