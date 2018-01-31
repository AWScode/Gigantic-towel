//Due day: Jan 31, 2018
//using loop to create a factorial calculator
import java.util.*;

public class Factorial{

  public static long doFactorial(int intNumber){
    long result = 1;
    for (int i = intNumber ; i > 1; i--) {
      result = result * i;
    }
    return result;
  }


  
  public static void main(String[] args) {
    System.out.println("--------Factorial Calculator--------");

    //inputs----------------------------------------
    System.out.print("Your number: ");
    Scanner input = new Scanner(System.in);
    String stringNumber = input.nextLine();

    //convert string to int
    int intNumber = Integer.parseInt(stringNumber);

    long finalResult = doFactorial(intNumber);


    System.out.print("Your result: ");
    System.out.println(finalResult);

  }






}
