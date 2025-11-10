import java.util.Scanner;
public class ComparingIntegers{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int numberOne;
    int numberOneSquare;
    System.out.print("Enter an integer number: ");

    numberOne = input.nextInt();
    numberOneSquare = numberOne * numberOne;

    if(numberOne < 100 && numberOneSquare < 100){
	System.out.print("Number one and its square are less than 100");
    }

    if(numberOne < 100 && numberOneSquare < 100){
	System.out.print("Number one and its square are less than 100");
    }

	if(numberOne == 100 && numberOneSquare == 100){
	System.out.print("Number one and its square are  equals to 100");
    }

	if(numberOne != 100 && numberOneSquare != 100){
	System.out.print("Number one and its square are not equals to 100");
    }
    }
}
